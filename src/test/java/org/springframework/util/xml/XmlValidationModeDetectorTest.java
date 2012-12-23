/**
 * created since 2012-10-2
 */
package org.springframework.util.xml;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Administrator
 * @version $Id: XmlValidationModeDetectorTest.java,v 0.1 2012-10-2 下午09:57:49 Administrator Exp $
 */
public class XmlValidationModeDetectorTest {

    private XmlValidationModeDetector detector = new XmlValidationModeDetector();
    
    @Test
    public void testDetectValidationMode() throws IOException {
        Resource resource = new ClassPathResource("beans.xml");
        int validatorMode = detector.detectValidationMode(resource.getInputStream());
        System.out.println(validatorMode);
    }
}
