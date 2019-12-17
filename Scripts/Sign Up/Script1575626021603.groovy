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

WebUI.navigateToUrl('https://app.gntkwhqzn-test.advisortodo.com/#/auth/signup')

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Signing up is easy It only takes a fe_e93503'), 
    'Nishit')

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Signing up is easy It only takes a fe_4992b8'), 
    'Sheth')

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Signing up is easy It only takes a fe_6bb433'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Signing up is easy It only takes a fe_336808'), 
    'nishit7531@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_advisor to-do/input_Signing up is easy It only takes a fe_1ac70e'), 
    'NP9hgsAAjFyq3K+3yMdUSg==')

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/button_Sign Up'))

WebUI.closeBrowser()

