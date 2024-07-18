package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	//Validate Shoes Items
		@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
	    public WebElement txtShoes;
		
	//Validate Pants Items
		@FindBy(xpath="//span[contains(@class, 'BOLD') and text()='Pants']") //You can use this OR  same xpath like Shoes  @FindBy(xpath="//span[2][contains(text(), 'Pants')]")
		public WebElement txtPants;
		
	//Validate Shirts Items
		@FindBy(xpath="//span[contains(@class, 'BOLD') and text()='Shirts']")
		public WebElement txtShirts;
		
		
		
		
		
	//Checkbox Brand Adidas
		@FindBy(xpath="//input[@aria-label='adidas']")
		public WebElement cbxBrandAdidas;

	//Checkbox Brand Nike
		@FindBy(xpath="//input[@aria-label='Nike']")
		public WebElement cbxBrandNike;

	//Checkbox Brand Unbranded
		@FindBy(xpath="//input[@aria-label='Unbranded']")
		public WebElement cbxBrandUnbranded;
		
	// Homework Color
		
	//Checkbox Color Black
		@FindBy(xpath="//input[@aria-label='Black']")
		public WebElement cbxColorBlack;
		
	//Checkbox Color White
		@FindBy(xpath="//input[@aria-label='White']")
		public WebElement cbxColorWhite;
		
	//Class july 6th 
	
	//Shirt link
	@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With')]")
	public WebElement linkShirtItems;
	
	//H.W (Nike Air Jordan)
	@FindBy(xpath= "//span[contains(text(),'Nike Air Jordan 1 Low Shoes White Wolf Gray Midnight Navy 553558-141 Men's NEW)]" )

	public WebElement linkShoeItems;
		
	

}
