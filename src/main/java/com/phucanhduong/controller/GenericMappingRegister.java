package com.phucanhduong.controller;

import com.phucanhduong.constant.ResourceName;
import com.phucanhduong.constant.SearchFields;
import com.phucanhduong.dto.address.AddressRequest;
import com.phucanhduong.dto.address.AddressResponse;
import com.phucanhduong.dto.address.DistrictRequest;
import com.phucanhduong.dto.address.DistrictResponse;
import com.phucanhduong.dto.address.ProvinceRequest;
import com.phucanhduong.dto.address.ProvinceResponse;
import com.phucanhduong.dto.address.WardRequest;
import com.phucanhduong.dto.address.WardResponse;
import com.phucanhduong.dto.authentication.RoleRequest;
import com.phucanhduong.dto.authentication.RoleResponse;
import com.phucanhduong.dto.authentication.UserRequest;
import com.phucanhduong.dto.authentication.UserResponse;
import com.phucanhduong.dto.cashbook.PaymentMethodRequest;
import com.phucanhduong.dto.cashbook.PaymentMethodResponse;
import com.phucanhduong.dto.chat.RoomRequest;
import com.phucanhduong.dto.chat.RoomResponse;
import com.phucanhduong.dto.customer.CustomerGroupRequest;
import com.phucanhduong.dto.customer.CustomerGroupResponse;
import com.phucanhduong.dto.customer.CustomerRequest;
import com.phucanhduong.dto.customer.CustomerResourceRequest;
import com.phucanhduong.dto.customer.CustomerResourceResponse;
import com.phucanhduong.dto.customer.CustomerResponse;
import com.phucanhduong.dto.customer.CustomerStatusRequest;
import com.phucanhduong.dto.customer.CustomerStatusResponse;
import com.phucanhduong.dto.employee.DepartmentRequest;
import com.phucanhduong.dto.employee.DepartmentResponse;
import com.phucanhduong.dto.employee.EmployeeRequest;
import com.phucanhduong.dto.employee.EmployeeResponse;
import com.phucanhduong.dto.employee.JobLevelRequest;
import com.phucanhduong.dto.employee.JobLevelResponse;
import com.phucanhduong.dto.employee.JobTitleRequest;
import com.phucanhduong.dto.employee.JobTitleResponse;
import com.phucanhduong.dto.employee.JobTypeRequest;
import com.phucanhduong.dto.employee.JobTypeResponse;
import com.phucanhduong.dto.employee.OfficeRequest;
import com.phucanhduong.dto.employee.OfficeResponse;
import com.phucanhduong.dto.general.ImageRequest;
import com.phucanhduong.dto.general.ImageResponse;
import com.phucanhduong.dto.inventory.CountRequest;
import com.phucanhduong.dto.inventory.CountResponse;
import com.phucanhduong.dto.inventory.DestinationRequest;
import com.phucanhduong.dto.inventory.DestinationResponse;
import com.phucanhduong.dto.inventory.DocketReasonRequest;
import com.phucanhduong.dto.inventory.DocketReasonResponse;
import com.phucanhduong.dto.inventory.DocketRequest;
import com.phucanhduong.dto.inventory.DocketResponse;
import com.phucanhduong.dto.inventory.ProductInventoryLimitRequest;
import com.phucanhduong.dto.inventory.ProductInventoryLimitResponse;
import com.phucanhduong.dto.inventory.PurchaseOrderRequest;
import com.phucanhduong.dto.inventory.PurchaseOrderResponse;
import com.phucanhduong.dto.inventory.StorageLocationRequest;
import com.phucanhduong.dto.inventory.StorageLocationResponse;
import com.phucanhduong.dto.inventory.TransferRequest;
import com.phucanhduong.dto.inventory.TransferResponse;
import com.phucanhduong.dto.inventory.VariantInventoryLimitRequest;
import com.phucanhduong.dto.inventory.VariantInventoryLimitResponse;
import com.phucanhduong.dto.inventory.WarehouseRequest;
import com.phucanhduong.dto.inventory.WarehouseResponse;
import com.phucanhduong.dto.order.OrderCancellationReasonRequest;
import com.phucanhduong.dto.order.OrderCancellationReasonResponse;
import com.phucanhduong.dto.order.OrderRequest;
import com.phucanhduong.dto.order.OrderResourceRequest;
import com.phucanhduong.dto.order.OrderResourceResponse;
import com.phucanhduong.dto.order.OrderResponse;
import com.phucanhduong.dto.product.BrandRequest;
import com.phucanhduong.dto.product.BrandResponse;
import com.phucanhduong.dto.product.CategoryRequest;
import com.phucanhduong.dto.product.CategoryResponse;
import com.phucanhduong.dto.product.GuaranteeRequest;
import com.phucanhduong.dto.product.GuaranteeResponse;
import com.phucanhduong.dto.product.ProductRequest;
import com.phucanhduong.dto.product.ProductResponse;
import com.phucanhduong.dto.product.PropertyRequest;
import com.phucanhduong.dto.product.PropertyResponse;
import com.phucanhduong.dto.product.SpecificationRequest;
import com.phucanhduong.dto.product.SpecificationResponse;
import com.phucanhduong.dto.product.SupplierRequest;
import com.phucanhduong.dto.product.SupplierResponse;
import com.phucanhduong.dto.product.TagRequest;
import com.phucanhduong.dto.product.TagResponse;
import com.phucanhduong.dto.product.UnitRequest;
import com.phucanhduong.dto.product.UnitResponse;
import com.phucanhduong.dto.product.VariantRequest;
import com.phucanhduong.dto.product.VariantResponse;
import com.phucanhduong.dto.promotion.PromotionRequest;
import com.phucanhduong.dto.promotion.PromotionResponse;
import com.phucanhduong.dto.review.ReviewRequest;
import com.phucanhduong.dto.review.ReviewResponse;
import com.phucanhduong.dto.reward.RewardStrategyRequest;
import com.phucanhduong.dto.reward.RewardStrategyResponse;
import com.phucanhduong.dto.waybill.WaybillRequest;
import com.phucanhduong.dto.waybill.WaybillResponse;
import com.phucanhduong.entity.address.Address;
import com.phucanhduong.entity.address.District;
import com.phucanhduong.entity.address.Ward;
import com.phucanhduong.entity.authentication.Role;
import com.phucanhduong.entity.authentication.User;
import com.phucanhduong.entity.cashbook.PaymentMethod;
import com.phucanhduong.entity.chat.Room;
import com.phucanhduong.entity.customer.Customer;
import com.phucanhduong.entity.customer.CustomerGroup;
import com.phucanhduong.entity.customer.CustomerResource;
import com.phucanhduong.entity.customer.CustomerStatus;
import com.phucanhduong.entity.employee.Department;
import com.phucanhduong.entity.employee.Employee;
import com.phucanhduong.entity.employee.JobLevel;
import com.phucanhduong.entity.employee.JobTitle;
import com.phucanhduong.entity.employee.JobType;
import com.phucanhduong.entity.employee.Office;
import com.phucanhduong.entity.general.Image;
import com.phucanhduong.entity.inventory.Count;
import com.phucanhduong.entity.inventory.Destination;
import com.phucanhduong.entity.inventory.DocketReason;
import com.phucanhduong.entity.inventory.ProductInventoryLimit;
import com.phucanhduong.entity.inventory.PurchaseOrder;
import com.phucanhduong.entity.inventory.StorageLocation;
import com.phucanhduong.entity.inventory.Transfer;
import com.phucanhduong.entity.inventory.VariantInventoryLimit;
import com.phucanhduong.entity.inventory.Warehouse;
import com.phucanhduong.entity.order.Order;
import com.phucanhduong.entity.order.OrderCancellationReason;
import com.phucanhduong.entity.order.OrderResource;
import com.phucanhduong.entity.product.Brand;
import com.phucanhduong.entity.product.Category;
import com.phucanhduong.entity.product.Guarantee;
import com.phucanhduong.entity.product.Product;
import com.phucanhduong.entity.product.Property;
import com.phucanhduong.entity.product.Specification;
import com.phucanhduong.entity.product.Supplier;
import com.phucanhduong.entity.product.Tag;
import com.phucanhduong.entity.product.Unit;
import com.phucanhduong.entity.product.Variant;
import com.phucanhduong.entity.reward.RewardStrategy;
import com.phucanhduong.mapper.address.AddressMapper;
import com.phucanhduong.mapper.address.DistrictMapper;
import com.phucanhduong.mapper.address.WardMapper;
import com.phucanhduong.mapper.authentication.RoleMapper;
import com.phucanhduong.mapper.authentication.UserMapper;
import com.phucanhduong.mapper.cashbook.PaymentMethodMapper;
import com.phucanhduong.mapper.chat.RoomMapper;
import com.phucanhduong.mapper.customer.CustomerGroupMapper;
import com.phucanhduong.mapper.customer.CustomerMapper;
import com.phucanhduong.mapper.customer.CustomerResourceMapper;
import com.phucanhduong.mapper.customer.CustomerStatusMapper;
import com.phucanhduong.mapper.employee.DepartmentMapper;
import com.phucanhduong.mapper.employee.EmployeeMapper;
import com.phucanhduong.mapper.employee.JobLevelMapper;
import com.phucanhduong.mapper.employee.JobTitleMapper;
import com.phucanhduong.mapper.employee.JobTypeMapper;
import com.phucanhduong.mapper.employee.OfficeMapper;
import com.phucanhduong.mapper.general.ImageMapper;
import com.phucanhduong.mapper.inventory.CountMapper;
import com.phucanhduong.mapper.inventory.DestinationMapper;
import com.phucanhduong.mapper.inventory.DocketReasonMapper;
import com.phucanhduong.mapper.inventory.ProductInventoryLimitMapper;
import com.phucanhduong.mapper.inventory.PurchaseOrderMapper;
import com.phucanhduong.mapper.inventory.StorageLocationMapper;
import com.phucanhduong.mapper.inventory.TransferMapper;
import com.phucanhduong.mapper.inventory.VariantInventoryLimitMapper;
import com.phucanhduong.mapper.inventory.WarehouseMapper;
import com.phucanhduong.mapper.order.OrderCancellationReasonMapper;
import com.phucanhduong.mapper.order.OrderMapper;
import com.phucanhduong.mapper.order.OrderResourceMapper;
import com.phucanhduong.mapper.product.BrandMapper;
import com.phucanhduong.mapper.product.CategoryMapper;
import com.phucanhduong.mapper.product.GuaranteeMapper;
import com.phucanhduong.mapper.product.ProductMapper;
import com.phucanhduong.mapper.product.PropertyMapper;
import com.phucanhduong.mapper.product.SpecificationMapper;
import com.phucanhduong.mapper.product.SupplierMapper;
import com.phucanhduong.mapper.product.TagMapper;
import com.phucanhduong.mapper.product.UnitMapper;
import com.phucanhduong.mapper.product.VariantMapper;
import com.phucanhduong.mapper.reward.RewardStrategyMapper;
import com.phucanhduong.repository.address.AddressRepository;
import com.phucanhduong.repository.address.DistrictRepository;
import com.phucanhduong.repository.address.WardRepository;
import com.phucanhduong.repository.authentication.RoleRepository;
import com.phucanhduong.repository.authentication.UserRepository;
import com.phucanhduong.repository.cashbook.PaymentMethodRepository;
import com.phucanhduong.repository.chat.RoomRepository;
import com.phucanhduong.repository.customer.CustomerGroupRepository;
import com.phucanhduong.repository.customer.CustomerRepository;
import com.phucanhduong.repository.customer.CustomerResourceRepository;
import com.phucanhduong.repository.customer.CustomerStatusRepository;
import com.phucanhduong.repository.employee.DepartmentRepository;
import com.phucanhduong.repository.employee.EmployeeRepository;
import com.phucanhduong.repository.employee.JobLevelRepository;
import com.phucanhduong.repository.employee.JobTitleRepository;
import com.phucanhduong.repository.employee.JobTypeRepository;
import com.phucanhduong.repository.employee.OfficeRepository;
import com.phucanhduong.repository.general.ImageRepository;
import com.phucanhduong.repository.inventory.CountRepository;
import com.phucanhduong.repository.inventory.DestinationRepository;
import com.phucanhduong.repository.inventory.DocketReasonRepository;
import com.phucanhduong.repository.inventory.ProductInventoryLimitRepository;
import com.phucanhduong.repository.inventory.PurchaseOrderRepository;
import com.phucanhduong.repository.inventory.StorageLocationRepository;
import com.phucanhduong.repository.inventory.TransferRepository;
import com.phucanhduong.repository.inventory.VariantInventoryLimitRepository;
import com.phucanhduong.repository.inventory.WarehouseRepository;
import com.phucanhduong.repository.order.OrderCancellationReasonRepository;
import com.phucanhduong.repository.order.OrderRepository;
import com.phucanhduong.repository.order.OrderResourceRepository;
import com.phucanhduong.repository.product.BrandRepository;
import com.phucanhduong.repository.product.CategoryRepository;
import com.phucanhduong.repository.product.GuaranteeRepository;
import com.phucanhduong.repository.product.ProductRepository;
import com.phucanhduong.repository.product.PropertyRepository;
import com.phucanhduong.repository.product.SpecificationRepository;
import com.phucanhduong.repository.product.SupplierRepository;
import com.phucanhduong.repository.product.TagRepository;
import com.phucanhduong.repository.product.UnitRepository;
import com.phucanhduong.repository.product.VariantRepository;
import com.phucanhduong.repository.reward.RewardStrategyRepository;
import com.phucanhduong.service.CrudService;
import com.phucanhduong.service.GenericService;
import com.phucanhduong.service.address.ProvinceService;
import com.phucanhduong.service.inventory.DocketService;
import com.phucanhduong.service.promotion.PromotionService;
import com.phucanhduong.service.review.ReviewService;
import com.phucanhduong.service.waybill.WaybillService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPatternParser;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@AllArgsConstructor
public class GenericMappingRegister {

    private ApplicationContext context;
    private RequestMappingHandlerMapping handlerMapping;

    // Controllers
    private GenericController<ProvinceRequest, ProvinceResponse> provinceController;
    private GenericController<DistrictRequest, DistrictResponse> districtController;
    private GenericController<WardRequest, WardResponse> wardController;
    private GenericController<AddressRequest, AddressResponse> addressController;
    private GenericController<UserRequest, UserResponse> userController;
    private GenericController<RoleRequest, RoleResponse> roleController;
    private GenericController<OfficeRequest, OfficeResponse> officeController;
    private GenericController<DepartmentRequest, DepartmentResponse> departmentController;
    private GenericController<JobLevelRequest, JobLevelResponse> jobLevelController;
    private GenericController<JobTypeRequest, JobTypeResponse> jobTypeController;
    private GenericController<JobTitleRequest, JobTitleResponse> jobTitleController;
    private GenericController<EmployeeRequest, EmployeeResponse> employeeController;
    private GenericController<CustomerGroupRequest, CustomerGroupResponse> customerGroupController;
    private GenericController<CustomerResourceRequest, CustomerResourceResponse> customerResourceController;
    private GenericController<CustomerStatusRequest, CustomerStatusResponse> customerStatusController;
    private GenericController<CustomerRequest, CustomerResponse> customerController;
    private GenericController<PropertyRequest, PropertyResponse> propertyController;
    private GenericController<CategoryRequest, CategoryResponse> categoryController;
    private GenericController<TagRequest, TagResponse> tagController;
    private GenericController<GuaranteeRequest, GuaranteeResponse> guaranteeController;
    private GenericController<UnitRequest, UnitResponse> unitController;
    private GenericController<SupplierRequest, SupplierResponse> supplierController;
    private GenericController<BrandRequest, BrandResponse> brandController;
    private GenericController<SpecificationRequest, SpecificationResponse> specificationController;
    private GenericController<ProductRequest, ProductResponse> productController;
    private GenericController<VariantRequest, VariantResponse> variantController;
    private GenericController<ImageRequest, ImageResponse> imageController;
    private GenericController<ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitController;
    private GenericController<VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitController;
    private GenericController<WarehouseRequest, WarehouseResponse> warehouseController;
    private GenericController<CountRequest, CountResponse> countController;
    private GenericController<DestinationRequest, DestinationResponse> destinationController;
    private GenericController<DocketReasonRequest, DocketReasonResponse> docketReasonController;
    private GenericController<TransferRequest, TransferResponse> transferController;
    private GenericController<DocketRequest, DocketResponse> docketController;
    private GenericController<StorageLocationRequest, StorageLocationResponse> storageLocationController;
    private GenericController<PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderController;
    private GenericController<OrderResourceRequest, OrderResourceResponse> orderResourceController;
    private GenericController<OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonController;
    private GenericController<OrderRequest, OrderResponse> orderController;
    private GenericController<WaybillRequest, WaybillResponse> waybillController;
    private GenericController<ReviewRequest, ReviewResponse> reviewController;
    private GenericController<PaymentMethodRequest, PaymentMethodResponse> paymentMethodController;
    private GenericController<PromotionRequest, PromotionResponse> promotionController;
    private GenericController<RoomRequest, RoomResponse> roomController;
    private GenericController<RewardStrategyRequest, RewardStrategyResponse> rewardStrategyController;

    // Services
    private GenericService<District, DistrictRequest, DistrictResponse> districtService;
    private GenericService<Ward, WardRequest, WardResponse> wardService;
    private GenericService<Address, AddressRequest, AddressResponse> addressService;
    private GenericService<User, UserRequest, UserResponse> userService;
    private GenericService<Role, RoleRequest, RoleResponse> roleService;
    private GenericService<Office, OfficeRequest, OfficeResponse> officeService;
    private GenericService<Department, DepartmentRequest, DepartmentResponse> departmentService;
    private GenericService<JobLevel, JobLevelRequest, JobLevelResponse> jobLevelService;
    private GenericService<JobType, JobTypeRequest, JobTypeResponse> jobTypeService;
    private GenericService<JobTitle, JobTitleRequest, JobTitleResponse> jobTitleService;
    private GenericService<Employee, EmployeeRequest, EmployeeResponse> employeeService;
    private GenericService<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> customerGroupService;
    private GenericService<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> customerResourceService;
    private GenericService<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> customerStatusService;
    private GenericService<Customer, CustomerRequest, CustomerResponse> customerService;
    private GenericService<Property, PropertyRequest, PropertyResponse> propertyService;
    private GenericService<Category, CategoryRequest, CategoryResponse> categoryService;
    private GenericService<Tag, TagRequest, TagResponse> tagService;
    private GenericService<Guarantee, GuaranteeRequest, GuaranteeResponse> guaranteeService;
    private GenericService<Unit, UnitRequest, UnitResponse> unitService;
    private GenericService<Supplier, SupplierRequest, SupplierResponse> supplierService;
    private GenericService<Brand, BrandRequest, BrandResponse> brandService;
    private GenericService<Specification, SpecificationRequest, SpecificationResponse> specificationService;
    private GenericService<Product, ProductRequest, ProductResponse> productService;
    private GenericService<Variant, VariantRequest, VariantResponse> variantService;
    private GenericService<Image, ImageRequest, ImageResponse> imageService;
    private GenericService<ProductInventoryLimit, ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitService;
    private GenericService<VariantInventoryLimit, VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitService;
    private GenericService<Warehouse, WarehouseRequest, WarehouseResponse> warehouseService;
    private GenericService<Count, CountRequest, CountResponse> countService;
    private GenericService<Destination, DestinationRequest, DestinationResponse> destinationService;
    private GenericService<DocketReason, DocketReasonRequest, DocketReasonResponse> docketReasonService;
    private GenericService<Transfer, TransferRequest, TransferResponse> transferService;
    private GenericService<StorageLocation, StorageLocationRequest, StorageLocationResponse> storageLocationService;
    private GenericService<PurchaseOrder, PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderService;
    private GenericService<OrderResource, OrderResourceRequest, OrderResourceResponse> orderResourceService;
    private GenericService<OrderCancellationReason, OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonService;
    private GenericService<Order, OrderRequest, OrderResponse> orderService;
    private GenericService<PaymentMethod, PaymentMethodRequest, PaymentMethodResponse> paymentMethodService;
    private GenericService<Room, RoomRequest, RoomResponse> roomService;
    private GenericService<RewardStrategy, RewardStrategyRequest, RewardStrategyResponse> rewardStrategyService;

    @PostConstruct
    public void registerControllers() throws NoSuchMethodException {

        register("provinces", provinceController, context.getBean(ProvinceService.class), ProvinceRequest.class);

        register("districts", districtController, districtService.init(
                context.getBean(DistrictRepository.class),
                context.getBean(DistrictMapper.class),
                SearchFields.DISTRICT,
                ResourceName.DISTRICT
        ), DistrictRequest.class);

        register("wards", wardController, wardService.init(
                context.getBean(WardRepository.class),
                context.getBean(WardMapper.class),
                SearchFields.WARD,
                ResourceName.WARD
        ), WardRequest.class);

        register("addresses", addressController, addressService.init(
                context.getBean(AddressRepository.class),
                context.getBean(AddressMapper.class),
                SearchFields.ADDRESS,
                ResourceName.ADDRESS
        ), AddressRequest.class);

        register("users", userController, userService.init(
                context.getBean(UserRepository.class),
                context.getBean(UserMapper.class),
                SearchFields.USER,
                ResourceName.USER
        ), UserRequest.class);

        register("roles", roleController, roleService.init(
                context.getBean(RoleRepository.class),
                context.getBean(RoleMapper.class),
                SearchFields.ROLE,
                ResourceName.ROLE
        ), RoleRequest.class);

        register("offices", officeController, officeService.init(
                context.getBean(OfficeRepository.class),
                context.getBean(OfficeMapper.class),
                SearchFields.OFFICE,
                ResourceName.OFFICE
        ), OfficeRequest.class);

        register("departments", departmentController, departmentService.init(
                context.getBean(DepartmentRepository.class),
                context.getBean(DepartmentMapper.class),
                SearchFields.DEPARTMENT,
                ResourceName.DEPARTMENT
        ), DepartmentRequest.class);

        register("job-levels", jobLevelController, jobLevelService.init(
                context.getBean(JobLevelRepository.class),
                context.getBean(JobLevelMapper.class),
                SearchFields.JOB_LEVEL,
                ResourceName.JOB_LEVEL
        ), JobLevelRequest.class);

        register("job-titles", jobTitleController, jobTitleService.init(
                context.getBean(JobTitleRepository.class),
                context.getBean(JobTitleMapper.class),
                SearchFields.JOB_TITLE,
                ResourceName.JOB_TITLE
        ), JobTitleRequest.class);

        register("job-types", jobTypeController, jobTypeService.init(
                context.getBean(JobTypeRepository.class),
                context.getBean(JobTypeMapper.class),
                SearchFields.JOB_TYPE,
                ResourceName.JOB_TYPE
        ), JobTypeRequest.class);

        register("employees", employeeController, employeeService.init(
                context.getBean(EmployeeRepository.class),
                context.getBean(EmployeeMapper.class),
                SearchFields.EMPLOYEE,
                ResourceName.EMPLOYEE
        ), EmployeeRequest.class);

        register("customer-groups", customerGroupController, customerGroupService.init(
                context.getBean(CustomerGroupRepository.class),
                context.getBean(CustomerGroupMapper.class),
                SearchFields.CUSTOMER_GROUP,
                ResourceName.CUSTOMER_GROUP
        ), CustomerGroupRequest.class);

        register("customer-resources", customerResourceController, customerResourceService.init(
                context.getBean(CustomerResourceRepository.class),
                context.getBean(CustomerResourceMapper.class),
                SearchFields.CUSTOMER_RESOURCE,
                ResourceName.CUSTOMER_RESOURCE
        ), CustomerResourceRequest.class);

        register("customer-status", customerStatusController, customerStatusService.init(
                context.getBean(CustomerStatusRepository.class),
                context.getBean(CustomerStatusMapper.class),
                SearchFields.CUSTOMER_STATUS,
                ResourceName.CUSTOMER_STATUS
        ), CustomerStatusRequest.class);

        register("customers", customerController, customerService.init(
                context.getBean(CustomerRepository.class),
                context.getBean(CustomerMapper.class),
                SearchFields.CUSTOMER,
                ResourceName.CUSTOMER
        ), CustomerRequest.class);

        register("properties", propertyController, propertyService.init(
                context.getBean(PropertyRepository.class),
                context.getBean(PropertyMapper.class),
                SearchFields.PROPERTY,
                ResourceName.PROPERTY
        ), PropertyRequest.class);

        register("categories", categoryController, categoryService.init(
                context.getBean(CategoryRepository.class),
                context.getBean(CategoryMapper.class),
                SearchFields.CATEGORY,
                ResourceName.CATEGORY
        ), CategoryRequest.class);

        register("tags", tagController, tagService.init(
                context.getBean(TagRepository.class),
                context.getBean(TagMapper.class),
                SearchFields.TAG,
                ResourceName.TAG
        ), TagRequest.class);

        register("guarantees", guaranteeController, guaranteeService.init(
                context.getBean(GuaranteeRepository.class),
                context.getBean(GuaranteeMapper.class),
                SearchFields.GUARANTEE,
                ResourceName.GUARANTEE
        ), GuaranteeRequest.class);

        register("units", unitController, unitService.init(
                context.getBean(UnitRepository.class),
                context.getBean(UnitMapper.class),
                SearchFields.UNIT,
                ResourceName.UNIT
        ), UnitRequest.class);

        register("suppliers", supplierController, supplierService.init(
                context.getBean(SupplierRepository.class),
                context.getBean(SupplierMapper.class),
                SearchFields.SUPPLIER,
                ResourceName.SUPPLIER
        ), SupplierRequest.class);

        register("brands", brandController, brandService.init(
                context.getBean(BrandRepository.class),
                context.getBean(BrandMapper.class),
                SearchFields.BRAND,
                ResourceName.BRAND
        ), BrandRequest.class);

        register("specifications", specificationController, specificationService.init(
                context.getBean(SpecificationRepository.class),
                context.getBean(SpecificationMapper.class),
                SearchFields.SPECIFICATION,
                ResourceName.SPECIFICATION
        ), SpecificationRequest.class);

        register("products", productController, productService.init(
                context.getBean(ProductRepository.class),
                context.getBean(ProductMapper.class),
                SearchFields.PRODUCT,
                ResourceName.PRODUCT
        ), ProductRequest.class);

        register("variants", variantController, variantService.init(
                context.getBean(VariantRepository.class),
                context.getBean(VariantMapper.class),
                SearchFields.VARIANT,
                ResourceName.VARIANT
        ), VariantRequest.class);

        register("images", imageController, imageService.init(
                context.getBean(ImageRepository.class),
                context.getBean(ImageMapper.class),
                SearchFields.IMAGE,
                ResourceName.IMAGE
        ), ImageRequest.class);

        register("product-inventory-limits", productInventoryLimitController, productInventoryLimitService.init(
                context.getBean(ProductInventoryLimitRepository.class),
                context.getBean(ProductInventoryLimitMapper.class),
                SearchFields.PRODUCT_INVENTORY_LIMIT,
                ResourceName.PRODUCT_INVENTORY_LIMIT
        ), ProductInventoryLimitRequest.class);

        register("variant-inventory-limits", variantInventoryLimitController, variantInventoryLimitService.init(
                context.getBean(VariantInventoryLimitRepository.class),
                context.getBean(VariantInventoryLimitMapper.class),
                SearchFields.VARIANT_INVENTORY_LIMIT,
                ResourceName.VARIANT_INVENTORY_LIMIT
        ), VariantInventoryLimitRequest.class);

        register("warehouses", warehouseController, warehouseService.init(
                context.getBean(WarehouseRepository.class),
                context.getBean(WarehouseMapper.class),
                SearchFields.WAREHOUSE,
                ResourceName.WAREHOUSE
        ), WarehouseRequest.class);

        register("counts", countController, countService.init(
                context.getBean(CountRepository.class),
                context.getBean(CountMapper.class),
                SearchFields.COUNT,
                ResourceName.COUNT
        ), CountRequest.class);

        register("destinations", destinationController, destinationService.init(
                context.getBean(DestinationRepository.class),
                context.getBean(DestinationMapper.class),
                SearchFields.DESTINATION,
                ResourceName.DESTINATION
        ), DestinationRequest.class);

        register("docket-reasons", docketReasonController, docketReasonService.init(
                context.getBean(DocketReasonRepository.class),
                context.getBean(DocketReasonMapper.class),
                SearchFields.DOCKET_REASON,
                ResourceName.DOCKET_REASON
        ), DocketReasonRequest.class);

        register("transfers", transferController, transferService.init(
                context.getBean(TransferRepository.class),
                context.getBean(TransferMapper.class),
                SearchFields.TRANSFER,
                ResourceName.TRANSFER
        ), TransferRequest.class);

        register("dockets", docketController, context.getBean(DocketService.class), DocketRequest.class);

        register("storage-locations", storageLocationController, storageLocationService.init(
                context.getBean(StorageLocationRepository.class),
                context.getBean(StorageLocationMapper.class),
                SearchFields.STORAGE_LOCATION,
                ResourceName.STORAGE_LOCATION
        ), StorageLocationRequest.class);

        register("purchase-orders", purchaseOrderController, purchaseOrderService.init(
                context.getBean(PurchaseOrderRepository.class),
                context.getBean(PurchaseOrderMapper.class),
                SearchFields.PURCHASE_ORDER,
                ResourceName.PURCHASE_ORDER
        ), PurchaseOrderRequest.class);

        register("order-resources", orderResourceController, orderResourceService.init(
                context.getBean(OrderResourceRepository.class),
                context.getBean(OrderResourceMapper.class),
                SearchFields.ORDER_RESOURCE,
                ResourceName.ORDER_RESOURCE
        ), OrderResourceRequest.class);

        register("order-cancellation-reasons", orderCancellationReasonController, orderCancellationReasonService.init(
                context.getBean(OrderCancellationReasonRepository.class),
                context.getBean(OrderCancellationReasonMapper.class),
                SearchFields.ORDER_CANCELLATION_REASON,
                ResourceName.ORDER_CANCELLATION_REASON
        ), OrderCancellationReasonRequest.class);

        register("orders", orderController, orderService.init(
                context.getBean(OrderRepository.class),
                context.getBean(OrderMapper.class),
                SearchFields.ORDER,
                ResourceName.ORDER
        ), OrderRequest.class);

        register("waybills", waybillController, context.getBean(WaybillService.class), WaybillRequest.class);

        register("reviews", reviewController, context.getBean(ReviewService.class), ReviewRequest.class);

        register("payment-methods", paymentMethodController, paymentMethodService.init(
                context.getBean(PaymentMethodRepository.class),
                context.getBean(PaymentMethodMapper.class),
                SearchFields.PAYMENT_METHOD,
                ResourceName.PAYMENT_METHOD
        ), PaymentMethodRequest.class);

        register("promotions", promotionController, context.getBean(PromotionService.class), PromotionRequest.class);

        register("rooms", roomController, roomService.init(
                context.getBean(RoomRepository.class),
                context.getBean(RoomMapper.class),
                SearchFields.ROOM,
                ResourceName.ROOM
        ), RoomRequest.class);

        register("reward-strategies", rewardStrategyController, rewardStrategyService.init(
                context.getBean(RewardStrategyRepository.class),
                context.getBean(RewardStrategyMapper.class),
                SearchFields.REWARD_STRATEGY,
                ResourceName.REWARD_STRATEGY
        ), RewardStrategyRequest.class);

    }

    private <I, O> void register(String resource,
                                 GenericController<I, O> controller,
                                 CrudService<Long, I, O> service,
                                 Class<I> requestType
    ) throws NoSuchMethodException {
        RequestMappingInfo.BuilderConfiguration options = new RequestMappingInfo.BuilderConfiguration();
        options.setPatternParser(new PathPatternParser());

        controller.setCrudService(service);
        controller.setRequestType(requestType);

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getAllResources", int.class, int.class,
                        String.class, String.class, String.class, boolean.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.POST)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("createResource", JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.PUT)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("updateResource", Long.class, JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.DELETE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.DELETE)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResources", List.class)
        );
    }

}
