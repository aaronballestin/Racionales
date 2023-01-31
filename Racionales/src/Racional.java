public class Racional{
    int _iNumerador;
    int _iDenominador;

    public Racional(int p_iNumerador , int p_iDenominador){
        _iNumerador = p_iNumerador;
        _iDenominador = p_iDenominador;
    }

    public Racional(int p_iNumerador){
        _iNumerador = p_iNumerador;
        _iDenominador = 1;
    }

    public int getNumerador(){
        return _iNumerador;
    }

    public int getDenominador(){
        return _iDenominador;
    }

    public void setNumerador(int p_iNumerador){
        _iNumerador = p_iNumerador;
    }

    public void setDenominador(int p_iDenominador){
        _iNumerador = p_iDenominador;
    }

    public void sum(Racional racional2){
        this._iNumerador = (_iNumerador * racional2.getDenominador()) + (racional2.getNumerador()*_iDenominador);
        this._iDenominador = _iDenominador * racional2.getDenominador();
    }

    public void res(Racional racional2){
        this._iNumerador = (_iNumerador * racional2.getDenominador()) - (racional2.getNumerador()*_iDenominador);
        this._iDenominador = _iDenominador * racional2.getDenominador();
    }

    public void mul(Racional racional2){
        this._iNumerador = _iNumerador * racional2.getNumerador();
        this._iDenominador = _iDenominador * racional2.getDenominador();
    }

    public void div(Racional racional2){
        this._iNumerador = _iNumerador * racional2.getDenominador();
        this._iDenominador = _iDenominador * racional2.getNumerador();
    }

    // public void simp(){
    //     int contador = 2;
    //     while(Math.abs(_iNumerador) >= contador && Math.abs(_iDenominador) >= contador){
    //         if(_iNumerador % contador == 0 && _iDenominador % contador == 0){
    //             this._iNumerador = _iNumerador / contador;
    //             this._iDenominador = _iDenominador / contador;
    //             contador = 2;
    //         }
    //         contador++;
    //     }
    // }

    public String toString(){
        return getNumerador()+" / "+getDenominador();
    }

    
}