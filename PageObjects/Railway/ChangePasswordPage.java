package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;
import Railway.Interface.ChangePasswordInterface;
import SeleniumHelper.SeleniumHelper;

public class ChangePasswordPage extends GeneralPage implements ChangePasswordInterface {

	// Locators
	private final By _txtCurrentPassword = By.xpath("");
	private final By _txtNewPassword = By.xpath("");
	private final By _txtConfirmPassword = By.xpath("");
	private final By _btnChangePassword = By.xpath("");

	// Elements
	protected WebElement getTxtCurrentPassword() {
		return Constant.WEBDRIVER.findElement(_txtCurrentPassword);
	}

	protected WebElement getTxtNewPassword() {
		return Constant.WEBDRIVER.findElement(_txtNewPassword);
	}

	protected WebElement getTxtConfirmPassword() {
		return Constant.WEBDRIVER.findElement(_txtConfirmPassword);
	}

	protected WebElement getBtnChangePassword() {
		return Constant.WEBDRIVER.findElement(_btnChangePassword);
	}

	// Methods
	@Override
	public void fillChangePasswordForm(String password, String newPassword, String confirmPassword) {
		// Fill register form
		SeleniumHelper.sendkeys(this.getTxtCurrentPassword(), password);
		SeleniumHelper.sendkeys(this.getTxtNewPassword(), newPassword);
		SeleniumHelper.sendkeys(this.getTxtConfirmPassword(), confirmPassword);
	}

	@Override
	public ChangePasswordPage clickBtnRegister() {
		SeleniumHelper.click(_btnChangePassword, this.getBtnChangePassword());
		return this;
	}

	@Override
	public ChangePasswordPage changePassword(String password, String newPassword, String confirmPassword) {
		// Submit change password form
		this.fillChangePasswordForm(password, newPassword, confirmPassword);
		this.clickBtnRegister();

		return this;
	}

}
