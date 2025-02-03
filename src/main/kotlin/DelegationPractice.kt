interface Downloader{
    fun download()
}
 class VideoDownloader(var name:String):Downloader{
    override fun download() {
        print("Downloaded Video ${name}")
    }

}
class FileDowloader(var name: String):Downloader{
    override fun download() {
        print("Donload File ${name}")
    }

}
class FileDownloaderDelegation(var  obj:FileDowloader):Downloader by obj{
//    override fun download() {
//        obj.download()
//    }

}


class DownloaderDelegation(var videoDownloader: VideoDownloader):Downloader by videoDownloader{
//    override fun download() {
//        videoDownloader.download()
//    }

}
fun main(){
var videoDl=VideoDownloader("of Movie")
    var fileDl=FileDowloader("of text")
   // videoDl.download()
    var downloaderDl=DownloaderDelegation(videoDl)
    downloaderDl.download()
}







