/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab121;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Teraesa
 */
public interface FileReaderStrategy {

    List<String> readAll(String path) throws FileNotFoundException, IOException;
    
}
