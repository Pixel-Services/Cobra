package com.pixelservices.server.hanlders;

import com.pixelservices.components.ExpectedBodyField;
import com.pixelservices.components.ExpectedRequestParameter;
import com.pixelservices.components.RequestHandler;
import com.pixelservices.server.dto.LicenseValidationRequest;
import com.pixelservices.server.dto.LicenseValidationRequestWrapper;
import com.pixelservices.lifecycle.Request;
import com.pixelservices.lifecycle.Response;
import com.pixelservices.models.HttpMethod;
import com.pixelservices.models.RouteInfo;

import java.time.LocalDateTime;

@RouteInfo(method = HttpMethod.POST, endpoint = "/license/validate")
public class LicenseValidationRequestHandler extends RequestHandler {
    private final ExpectedRequestParameter licenseKeyParam;
    private final ExpectedBodyField hardwareIdField;

    public LicenseValidationRequestHandler(Request req, Response res) {
        super(req, res);

        licenseKeyParam = expectedRequestParameter("licenseKey", "The License key to validate");
        hardwareIdField = expectedBodyField("hardwareId", "The Hardware ID of the Machine");
    }

    @Override
    public Object handle() {


        String ip = req.clientAddress().getAddress().getHostAddress();

        LicenseValidationRequestWrapper requestWrapper = new LicenseValidationRequestWrapper(new LicenseValidationRequest(licenseKeyParam.getString(), hardwareIdField.getString()), ip, LocalDateTime.now());

        return null;

    }
}