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

WebUI.openBrowser('https://www.etiqa.com.my/v2/homepage?_ga=2.89972763.1886916648.1733125327-1700097510.1733125327&_gac=1.23752008.1733195700.CjwKCAiA0rW6BhAcEiwAQH28Insxng2BvDnvN3qOSMdGtlrKkTQho1Erki1K56tquJK8n_GRlU1diRoCLHQQAvD_BwE&_gl=1*ynprwm*_gcl_aw*R0NMLjE3MzMxOTU3MDAuQ2p3S0NBaUEwclc2QmhBY0Vpd0FRSDI4SW5zeG5nMkJ2RG52TjNxT1NNZEd0bHJLa1RRaG8xRXJraTFLNTZ0cXVKSzhuX0dSbFUxZGlSb0NMSFFRQXZEX0J3RQ..*_gcl_au*MTI0Mjg2MDA3NS4xNzMzMTI1MzI3*_ga*MTcwMDA5NzUxMC4xNzMzMTI1MzI3*_ga_YC2ZKNB9T5*MTczMzE5NTcwMC4yLjAuMTczMzE5NTcwMC42MC4wLjA.')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC1/Button_X'))

WebUI.click(findTestObject('TC1/Button_Car'))

WebUI.click(findTestObject('TC1/Button_ MotorTakaful_LearnMore'))

WebUI.click(findTestObject('TC1/Button_Apply Online'))

WebUI.sendKeys(findTestObject('TC1/Input_PlateNumber'), findTestData('Test Data for Car Insurance').getValue(1, 1))

WebUI.sendKeys(findTestObject('TC1/Input_Postcode'), findTestData('Test Data for Car Insurance').getValue(1, 2))

WebUI.sendKeys(findTestObject('TC1/Input_IdNumber'), findTestData('Test Data for Car Insurance').getValue(1, 3))

WebUI.click(findTestObject('TC1/Button_GetQuoteButton'))

WebUI.closeBrowser()

