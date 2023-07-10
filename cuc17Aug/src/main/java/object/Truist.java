package object;

public interface Truist {
	// Login objects
	String truist_signin_link = "/html/body/app-root/div[2]/app-topnav-api/tru-core-navbar/header/nav/div/tru-core-navbar-utility/ul/li[2]/tru-core-link-secondary/a/div";
	String truist_signin_btn = "/html/body/app-root/div/div/main/app-login/div/tru-core-grid/tru-core-grid/tru-core-card/div/tru-core-sign-in/tru-core-card/div/tru-core-card-content/div/form/tru-core-button-primary/button";
	String truist_userid_txt = "//*[@id=\"tru-core-input-1\"]";
	String truist_password_txt = "//*[@id=\"tru-core-input-2\"]";
	String truist_signinback = "/html/body/app-root/div/div/main/app-error/div/div/div/tru-core-card/div/tru-core-card-content/tru-core-grid[1]/tru-core-button-primary[2]/button";

	// Registration objects
	String truist_regbtn = "/html/body/app-root/div[2]/div[1]/app-home/div/div[1]/div/tru-core-link-primary/a";
	String truist_firstnametxt = "//*[@id=\"tru-core-input-2\"]";
	String truist_lastnametxt = "//*[@id=\"tru-core-input-3\"]";
	String truist_cmpnametxt = "//*[@id=\"tru-core-input-4\"]";
	String truist_empemailtxt = "//*[@id=\"tru-core-input-5\"]";
	String trist_submitbtn = "/html/body/app-root/div[2]/div[1]/app-signup/div/div[3]/form/div[4]/tru-core-button-primary/button";

	// homePage objects
	String heroHeading = "h1.tru-core-margin-bottom--sm";
	String heroCapheading = "p.tru-core-eyebrow.tru-core-margin-bottom--lg";
	String heroRegisterButton = "/html/body/app-root/div[2]/div[1]/app-home/div/div[1]/div/tru-core-link-primary/a";
	String heroSubheading = "p.tru-core-text-heading.tru-core-text--md.tru-core-margin-bottom--xxl";
	String APICate_Subheading = "p.tru-core-text-primary.tru-core-margin-bottom--xxl";
	String APIcate_heading = "/html/body/app-root/div[2]/div[1]/app-home/div/div[2]/h2";
	String Nav_HomeLink = "//*[@id=\"/home-primary-nav-link\"]/div";
	String Nav_APIs = "//*[@id=\"tru-core-popover-trigger-1\"]/span[1]";
	String Nav_Support = "//*[@id=\"tru-core-popover-trigger-2\"]/span[1]";
	String Category_Commercial = "/html/body/app-root/div[2]/div[1]/app-home/div/div[2]/tru-core-grid/tru-core-card[1]/div/div/a/span";
	String Category_Personal = "/html/body/app-root/div[2]/div[1]/app-home/div/div[2]/tru-core-grid/tru-core-card[2]/div/div/a/span";
	String Category_Accounts = "/html/body/app-root/div[2]/div[1]/app-home/div/div[2]/tru-core-grid/tru-core-card[3]/div/div/a/span";

	// support
	String supportNavclick = "//button[@id='tru-core-popover-trigger-2']//tru-core-icon[@class='tru-core-navbar__list-item-icon tru-core-icon-wrapper']//*[name()='svg']";
	String ContactUslnk = "//a[@id='/contact-us-primary-nav-link']";
	String ContUsCapheading = "/html/body/app-root/div[2]/div[1]/app-contact-us/div[1]/div/div/p";
	String ContUs_heading = "/html/body/app-root/div[2]/div[1]/app-contact-us/div[1]/div/div/h1";
	String ContUs_CreatAcclink = "/html/body/app-root/div[2]/div[1]/app-contact-us/div[1]/div/div/tru-core-link-text/a";
	String ContUs_Cancelbtn = "//button[normalize-space()='Cancel']";
	String ContUs_FrmHeading = "/html/body/app-root/div[2]/div[1]/app-contact-us/div[3]/form/div/p";
	String ContUs_FirstNmTxtbox = "//*[@id=\"tru-core-input-2\"]";
	String ContUs_LastNmTxtbox = "//*[@id=\"tru-core-input-3\"]";
	String ContUs_EmailTxtbox = "//*[@id=\"tru-core-input-4\"]";
	String ContUs_PhoneTxtbox = "//*[@id=\"tru-core-input-5\"]";
	String ContUs_WhyDropdown = "//*[@id=\"tru-core-input-8\"]";
	String ContUs_MsgTxtbox = "//*[@id=\"tru-core-text-area-7\"]";
	String ContUs_Submitbtn = "//button[@type='submit']";
	String ContUs_WhyDropOp1 = "//*[@id=\"6-option-id-2\"]/div/div/div";

}
