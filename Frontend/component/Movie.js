import './movie.css';

function Movie(props){

    return(
        <div class="movie-card">
            <img src={props.image}/>

            <center>
                <h5>{props.title}</h5>

                <p>{props.zoner}</p>
            </center>
           

        </div>
    );


}
export default Movie;