package hw3;

public enum HTTPError {
    Bad_Request, Unauthorized, Payment, Required, Forbidden, Not_Found,
    Internal_Server_Error, Not_Implemented, Bad_Gateway, Service_Unavailable, Gateway_Timeout;

    public static void getHTTPError(int num){
        switch (num){
            case 400:
                System.out.println(HTTPError.Bad_Request);
                break;
            case 401:
                System.out.println(HTTPError.Unauthorized);
                break;
            case 402:
                System.out.println(HTTPError.Payment);
                break;
            case 403:
                System.out.println(HTTPError.Required);
                break;
            case 404:
                System.out.println(HTTPError.Forbidden);
                break;
            case 405:
                System.out.println(HTTPError.Not_Found);
                break;
            case 500:
                System.out.println(HTTPError.Internal_Server_Error);
                break;
            case 501:
                System.out.println(HTTPError.Not_Implemented);
                break;
            case 502:
                System.out.println(HTTPError.Bad_Gateway);
                break;
            case 503:
                System.out.println(HTTPError.Service_Unavailable);
                break;
            case 504:
                System.out.println(HTTPError.Gateway_Timeout);
                break;
            default:
                System.out.println("Unrecognized error");
        }
    }

    }
