import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletarTransporteComponent } from './deletar-transporte.component';

describe('DeletarTransporteComponent', () => {
  let component: DeletarTransporteComponent;
  let fixture: ComponentFixture<DeletarTransporteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletarTransporteComponent]
    });
    fixture = TestBed.createComponent(DeletarTransporteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
