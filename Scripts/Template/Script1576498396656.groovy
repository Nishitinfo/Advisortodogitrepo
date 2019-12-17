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

WebUI.setText(findTestObject('Page_advisor to-do/input_Sign In_form-control'), 'admin@advisortodo.com')

WebUI.setEncryptedText(findTestObject('Page_advisor to-do/input_Sign In_form-control_1'), '7Dxoto1EjKeORhrTDROfog==')

WebUI.sendKeys(findTestObject('Page_advisor to-do/input_Sign In_form-control_1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Templates_menu-arrow'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/a_Template List'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Template List_fa fa-plus'))

WebUI.setText(findTestObject('Page_advisor to-do/input__form-control input-xs'), 'New Template')

WebUI.sendKeys(findTestObject('Page_advisor to-do/input__form-control input-xs'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Add Task_templateSubTask'), 'Template task')

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Add Task_fa fa-plus'))

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Add Task_templateSubTask'), 'template task2')

WebUI.sendKeys(findTestObject('Object Repository/Page_advisor to-do/input_Add Task_templateSubTask'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/button_List'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Admin Admin_fa fa-pencil'))

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Add Task_templateSubTask'), 'task 3')

WebUI.sendKeys(findTestObject('Object Repository/Page_advisor to-do/input_Add Task_templateSubTask'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/button_List'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Templates_menu-arrow'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/a_Add Template'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/a_Template List'))

WebUI.click(findTestObject('Page_advisor to-do/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Archived Projects_fa fa-plus'))

WebUI.setText(findTestObject('Page_advisor to-do/input_Priority_combobox1'), 'new')

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_New Template'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Templates_menu-arrow'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/a_Template List'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/i_Admin Admin_fa fa-trash'))

WebUI.click(findTestObject('Page_advisor to-do/a_No Notifications_profileDropdown'))

WebUI.click(findTestObject('Page_advisor to-do/span_Logout'))

WebUI.closeBrowser()

