/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.ScanBarcode: ImageVector
    get() {
        if (_ScanBarcode != null) {
            return _ScanBarcode!!
        }
        _ScanBarcode = ImageVector.Builder(
            name = "Filled.ScanBarcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                verticalLineTo(6.5f)
                curveTo(1.25f, 3.6f, 3.61f, 1.25f, 6.5f, 1.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 1.25f, 9.75f, 1.59f, 9.75f, 2f)
                curveTo(9.75f, 2.41f, 9.41f, 2.75f, 9f, 2.75f)
                horizontalLineTo(6.5f)
                curveTo(4.43f, 2.75f, 2.75f, 4.43f, 2.75f, 6.5f)
                verticalLineTo(9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                verticalLineTo(6.5f)
                curveTo(21.25f, 4.43f, 19.57f, 2.75f, 17.5f, 2.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 2.75f, 14.25f, 2.41f, 14.25f, 2f)
                curveTo(14.25f, 1.59f, 14.59f, 1.25f, 15f, 1.25f)
                horizontalLineTo(17.5f)
                curveTo(20.39f, 1.25f, 22.75f, 3.6f, 22.75f, 6.5f)
                verticalLineTo(9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 22.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 22.75f, 15.25f, 22.41f, 15.25f, 22f)
                curveTo(15.25f, 21.59f, 15.59f, 21.25f, 16f, 21.25f)
                horizontalLineTo(17.5f)
                curveTo(19.57f, 21.25f, 21.25f, 19.57f, 21.25f, 17.5f)
                verticalLineTo(16f)
                curveTo(21.25f, 15.59f, 21.59f, 15.25f, 22f, 15.25f)
                curveTo(22.41f, 15.25f, 22.75f, 15.59f, 22.75f, 16f)
                verticalLineTo(17.5f)
                curveTo(22.75f, 20.4f, 20.39f, 22.75f, 17.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
                horizontalLineTo(6.5f)
                curveTo(3.61f, 22.75f, 1.25f, 20.4f, 1.25f, 17.5f)
                verticalLineTo(15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15f)
                verticalLineTo(17.5f)
                curveTo(2.75f, 19.57f, 4.43f, 21.25f, 6.5f, 21.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 21.25f, 9.75f, 21.59f, 9.75f, 22f)
                curveTo(9.75f, 22.41f, 9.41f, 22.75f, 9f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 5.25f)
                horizontalLineTo(7f)
                curveTo(5.86f, 5.25f, 5.25f, 5.85f, 5.25f, 7f)
                verticalLineTo(9f)
                curveTo(5.25f, 10.15f, 5.86f, 10.75f, 7f, 10.75f)
                horizontalLineTo(9f)
                curveTo(10.14f, 10.75f, 10.75f, 10.15f, 10.75f, 9f)
                verticalLineTo(7f)
                curveTo(10.75f, 5.85f, 10.14f, 5.25f, 9f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 5.25f)
                horizontalLineTo(15f)
                curveTo(13.86f, 5.25f, 13.25f, 5.85f, 13.25f, 7f)
                verticalLineTo(9f)
                curveTo(13.25f, 10.15f, 13.86f, 10.75f, 15f, 10.75f)
                horizontalLineTo(17f)
                curveTo(18.14f, 10.75f, 18.75f, 10.15f, 18.75f, 9f)
                verticalLineTo(7f)
                curveTo(18.75f, 5.85f, 18.14f, 5.25f, 17f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 13.25f)
                horizontalLineTo(7f)
                curveTo(5.86f, 13.25f, 5.25f, 13.85f, 5.25f, 15f)
                verticalLineTo(17f)
                curveTo(5.25f, 18.15f, 5.86f, 18.75f, 7f, 18.75f)
                horizontalLineTo(9f)
                curveTo(10.14f, 18.75f, 10.75f, 18.15f, 10.75f, 17f)
                verticalLineTo(15f)
                curveTo(10.75f, 13.85f, 10.14f, 13.25f, 9f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 13.25f)
                horizontalLineTo(15f)
                curveTo(13.86f, 13.25f, 13.25f, 13.85f, 13.25f, 15f)
                verticalLineTo(17f)
                curveTo(13.25f, 18.15f, 13.86f, 18.75f, 15f, 18.75f)
                horizontalLineTo(17f)
                curveTo(18.14f, 18.75f, 18.75f, 18.15f, 18.75f, 17f)
                verticalLineTo(15f)
                curveTo(18.75f, 13.85f, 18.14f, 13.25f, 17f, 13.25f)
                close()
            }
        }.build()

        return _ScanBarcode!!
    }

@Suppress("ObjectPropertyName")
private var _ScanBarcode: ImageVector? = null
