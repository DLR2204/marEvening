import {Component} from 'react';

class Calculator extends Component{

    state ={a:30,b:20,showResult:false}


    setA=e=>{this.setState({a:parseInt(e.target.value),showResult:false})}

    setB=e=>{this.setState({b:parseInt(e.target.value),showResult:false})}

    setShowResult=(e)=>{this.setState(prevState=>{
        return {showResult:!prevState.showResult}
    })}


    render(){
            return(
                <div>
                    
                    <center>  <h1><u>Calculator</u></h1></center><h2><br/><br/> 

A:- <input type="text" placeholder={this.state.a}  onChange={this.setA}/>

B:- <input type="text" placeholder={this.state.b} onChange={this.setB}/> </h2> <br/><br/>

            <center><button type="button" className='btn btn-success' onClick={this.setShowResult}>CheckResult</button></center><br/><br/><br/>

                {this.state.showResult  ?(<div> <h3>

Add:-  {this.state.a + this.state.b}

<br/><br/>   Sub:- {this.state.a - this.state.b}

<br/> <br/>   Div:- {this.state.a / this.state.b}

<br/><br/>    Mul:- {this.state.a * this.state.b}

<br/></h3></div>):(<div>
            <h2><center>Please click on the check Result Button</center></h2>
    </div>)}
                  

                </div>
            );
    }
}

export default Calculator;