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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Record_Mode_Objects/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Record_Mode_Objects/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Record_Mode_Objects/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/input_None_programs'))

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/th_'))

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/td_24'))

WebUI.setText(findTestObject('Object Repository/Record_Mode_Objects/textarea_Comment_comment'), 'Jida Intezaar si, Aaj Rabba Wohi Din Aaya hai')

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Record_Mode_Objects/h2_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.verifyElementText(findTestObject('Object Repository/Record_Mode_Objects/p_Jida Intezaar si, Aaj Rabba Wohi Din Aaya hai'), 
    'Jida Intezaar si, Aaj Rabba Wohi Din Aaya hai')

WebUI.click(findTestObject('Object Repository/Record_Mode_Objects/a_Go to Homepage'))

WebUI.closeBrowser()

