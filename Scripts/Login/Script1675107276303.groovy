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

WebUI.navigateToUrl('https://auth.aimmanager.blue/auth/realms/mycompany/protocol/openid-connect/auth?response_type=code&client_id=aim-web&state=4aa723cc03a899f5bf256c8269883f8c&redirect_uri=https%3A%2F%2Fmycompany.aimmanager.blue%2Fcb&nonce=a040ee08ee7629b5f413aef37b1aff35&scope=openid%20email%20profile')

WebUI.waitForElementClickable(findTestObject('Login/Page_Inicia sesin en mycompany/input_Usuario o email_username'), 30)

WebUI.setText(findTestObject('Object Repository/Login/Page_Inicia sesin en mycompany/input_Usuario o email_username'), 'jose.mendoza@aimmanager.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Inicia sesin en mycompany/input_Contrasea_password'), 
    'tdYiOSE239YfUcxPrwyxMg==')

WebUI.click(findTestObject('Object Repository/Login/Page_Inicia sesin en mycompany/input_Contrasea_login'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Login/Page_AIM Manager/a_Volver al menu principal_collapse-menu-btn'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_AIM Manager/a_Volver al menu principal_collapse-menu-btn'))

WebUI.click(findTestObject('Object Repository/Login/Page_AIM Manager/i_Jos Mendoza_fas fa-sign-out-alt'))

WebUI.closeBrowser()

