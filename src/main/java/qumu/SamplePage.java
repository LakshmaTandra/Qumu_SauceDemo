package qumu;

import org.openqa.selenium.support.PageFactory;

public class SamplePage extends BasePage {
    public SamplePage() {
        PageFactory.initElements(driver, this);
    }

/**
 * You can use this class to add page objects and methods.
 */
    
    public void verifytitle() {
    	System.out.println("Title is :");
    }
    
}
