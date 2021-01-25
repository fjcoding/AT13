org.fundacionjala.at13.authenticator;

public class Auth{​​

    public static void main(String[] args) {​​

    }​​
    public boolean validate(String[]namesList){​​
        for(int i=0;i<namesList.length;i++){​​
            if(namesList[i].length> 6 && namesList[i].length<10)
            {​​
            for(int j=0;j<namesList[i].length;j++){​​
                if(namesList[j].match("[a-z]+") ) // comprobar con ASCII si es minuscula
            }​​
            }​​else return false;
            }​​
        return res;
    }​​
    
}​​
