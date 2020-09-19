import com.zhou.javakc.data.elasticsearch.ElasticsearchApplication;
import com.zhou.javakc.data.elasticsearch.phone.entity.Phone;
import com.zhou.javakc.data.elasticsearch.phone.service.PhoneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.data.elasticsearch.core.document.Document;

@SpringBootTest(classes = ElasticsearchApplication.class)
public class ElasticSearchApplication {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Autowired
    private PhoneService phoneService;

    @Test
    public void test()
    {
        //设置索引信息(绑定实体 Phone)
//        IndexOperations indexOperations = elasticsearchRestTemplate.indexOps(Phone.class);
        //将绑定的实体创建索引映射
//        Document document = indexOperations.createMapping();
        //将通过类创建的映射写入索引
//        indexOperations.putMapping(document);
        //删除索引库
//        indexOperations.delete();

        //添加文档
//        phoneService.save(new Phone(1, "HUAWEI Mate30 Pro 5G", "手机", "华为", 6899.00, "https://res.vmallres.com/pimages//product/6901443353262/800_800_AFFE9AA1E983E45ECB491A2900027BF8AF03C3990462FD2Bmp.png"));
//        phoneService.save(new Phone(2, "vivo X50 Pro+5G版", "手机", "vivo", 4998.00, "https://shopstatic.vivo.com.cn/vivoshop/commodity/42/10002842_1591257029684_750x750.png"));
//        phoneService.save(new Phone(3, "小米10至尊纪念版", "手机", "小米", 6999.00, "https://cdn.cnbj0.fds.api.mi-img.com/b2c-shopapi-pms/pms_1597145894.43258180.jpg"));
//        phoneService.save(new Phone(4, "iPad Pro", "平板", "Apple", 13099.00, "https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/ipad-pro-12-select-cell-spacegray-202003_GEO_CN?wid=940&hei=1112&fmt=png-alpha&qlt=80&.v=1583552335843"));

        //查询全部文档
//        phoneService.findAll().forEachRemaining(System.out::println);

        //条件搜索
//        phoneService.findByNameLike("5G").forEach(System.out::println);
    }

}
