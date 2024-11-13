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

WebUI.openBrowser('https://the-internet.herokuapp.com/javascript_alerts')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Alerts_Demo_Objects/Page_The Internet/button_Click for JS Alert'))

WebUI.delay(2)

WebUI.waitForAlert(3)

//WebUI.acceptAlert()
WebUI.delay(2)

WebUI.verifyTextPresent('You successfully clicked an alert', false)

WebUI.delay(2)

WebUI.click(findTestObject('Alerts_Demo_Objects/Page_The Internet/button_Click for JS Confirm'))

WebUI.delay(2)

WebUI.waitForAlert(3)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.verifyTextPresent('You clicked: Cancel', false)

WebUI.delay(2)

WebUI.click(findTestObject('Alerts_Demo_Objects/Page_The Internet/button_Click for JS Prompt'))

WebUI.delay(2)

WebUI.waitForAlert(3)

WebUI.setAlertText('Set Text via Automation')

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.verifyTextPresent('You entered: Set Text via Automation', false)

WebUI.delay(2)

WebUI.closeBrowser()

