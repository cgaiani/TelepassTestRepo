import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('FunzioniBase/fNavigaHomePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FunzioniBase/fLogin'), [('pUsername') : pUser, ('pPassword') : pPass], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_homeContratto/link_aggiornaDati'))

WebUI.click(findTestObject('Page_homeContratto/link_aggiornaDati'))

WebUI.click(findTestObject('Page_clienteModificaDati/link_cambiaEmail'))

WebUI.setText(findTestObject('Page_clienteModificaDati/input_inputPostaElettronica'), 'cgaiani73@gmail.com')

WebUI.setText(findTestObject('Page_clienteModificaDati/input_inputPostaElettronicaVer'), 'cgaiani73@gmail.com')

WebUI.submit(findTestObject('Page_clienteModificaDati/modificaForm'))

WebUI.closeBrowser()

