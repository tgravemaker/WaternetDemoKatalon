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

WebUI.navigateToUrl('https://www.waternet.nl/service-en-contact/rekening-betalen/te-laat-met-betalen/')

WebUI.waitForElementPresent(findTestObject('WaternetDemo/Page_Te laat met betalen/h3_Cookies'), 0)

WebUI.click(findTestObject('WaternetDemo/Page_Te laat met betalen/button_Ja'))

WebUI.click(findTestObject('Object Repository/WaternetDemo/Page_Te laat met betalen/label_Ja'))

WebUI.setText(findTestObject('Object Repository/WaternetDemo/Page_Te laat met betalen/input_Fijn om te horen Kunt u kort vertelle_933eda'), 
    'Duidelijke informatie')

WebUI.click(findTestObject('Object Repository/WaternetDemo/Page_Te laat met betalen/button_Verzenden'))

WebUI.verifyElementText(findTestObject('Object Repository/WaternetDemo/Page_Te laat met betalen/div_Bedankt voor uw feedback'), 
    'Bedankt voor uw feedback!')

WebUI.closeBrowser()

