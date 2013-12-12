/*
 * Autopsy Forensic Browser
 * 
 * Copyright 2013 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.filetypeid;

import org.sleuthkit.datamodel.AbstractFile;

/*
 * This will allow us to swap and or compare alternative libraries 
 * 
 * For extension, an implementation could use a custom lookup table mapping type
 * to an extension string list instead of the third-party library's extension
 * reporting.
 */
public interface FileTypeDetectionInterface {
    
    // Struct to hold multiple values for return 
    public class FileIdInfo {
       public String type;     
       public String extension; 
    }
    
    // You only have one job
    FileIdInfo attemptMatch(AbstractFile abstractFile);    
}
