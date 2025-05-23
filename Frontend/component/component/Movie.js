import './movie.css';

function Movie(props){

    return(
        <div class="movie-card">
            <img src={props.image}/>

            <center>
                <h6>{props.title}</h6>

                <p>{props.zoner}</p>
            </center>
           

        </div>
    );


}
export default Movie;