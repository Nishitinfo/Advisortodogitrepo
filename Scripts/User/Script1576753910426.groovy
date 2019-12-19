import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.gntkwhqzn-test.advisortodo.com/#/auth/signin')

WebUI.setText(findTestObject('Object Repository/User/Page_advisor to-do/input_Sign In_form-control'), 'admin@advisortodo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User/Page_advisor to-do/input_Sign In_form-control_1'), '7Dxoto1EjKeORhrTDROfog==')

WebUI.sendKeys(findTestObject('Object Repository/User/Page_advisor to-do/input_Sign In_form-control_1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/a_Users'))

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/a_User List'))

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/button_User List_addUser'))

WebUI.setText(findTestObject('Object Repository/User/Page_advisor to-do/input__form-control input-xs'), 'Kavi')

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/div_Email'))

WebUI.setText(findTestObject('Object Repository/User/Page_advisor to-do/input__form-control input-xs'), 'kavi@infobizzs.com')

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/div_Mobile'))

WebUI.setText(findTestObject('Object Repository/User/Page_advisor to-do/input_Mobile_form-control input-xs'), '(895) 658-5695')

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/div_Select Role'))

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/div_Admin'))

WebUI.click(findTestObject('Error/Page_advisor to-do/input__form-control input-xs'))

WebUI.setText(findTestObject('Error/Page_advisor to-do/input__form-control input-xs'), 'Bhavsar')

WebUI.setEncryptedText(findTestObject('Object Repository/User/Page_advisor to-do/input__form-control input-xs_1'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Error/Page_advisor to-do/input_Phone_form-control input-xs'))

WebUI.setText(findTestObject('Error/Page_advisor to-do/input_Phone_form-control input-xs'), '(858) 586-9333')

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/button_Add'))

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/button_(858) 586-9333_deleteUser48'))

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/a_No Notifications_profileDropdown'))

WebUI.click(findTestObject('Object Repository/User/Page_advisor to-do/div_Logout'))

WebUI.closeBrowser()

