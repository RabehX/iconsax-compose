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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ScanBarcode: ImageVector
    get() {
        if (_ScanBarcode != null) {
            return _ScanBarcode!!
        }
        _ScanBarcode = ImageVector.Builder(
            name = "Outline.ScanBarcode",
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
                moveTo(9f, 11.25f)
                horizontalLineTo(7f)
                curveTo(5.59f, 11.25f, 4.75f, 10.41f, 4.75f, 9f)
                verticalLineTo(7f)
                curveTo(4.75f, 5.59f, 5.59f, 4.75f, 7f, 4.75f)
                horizontalLineTo(9f)
                curveTo(10.41f, 4.75f, 11.25f, 5.59f, 11.25f, 7f)
                verticalLineTo(9f)
                curveTo(11.25f, 10.41f, 10.41f, 11.25f, 9f, 11.25f)
                close()
                moveTo(7f, 6.25f)
                curveTo(6.41f, 6.25f, 6.25f, 6.41f, 6.25f, 7f)
                verticalLineTo(9f)
                curveTo(6.25f, 9.59f, 6.41f, 9.75f, 7f, 9.75f)
                horizontalLineTo(9f)
                curveTo(9.59f, 9.75f, 9.75f, 9.59f, 9.75f, 9f)
                verticalLineTo(7f)
                curveTo(9.75f, 6.41f, 9.59f, 6.25f, 9f, 6.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 11.25f)
                horizontalLineTo(15f)
                curveTo(13.59f, 11.25f, 12.75f, 10.41f, 12.75f, 9f)
                verticalLineTo(7f)
                curveTo(12.75f, 5.59f, 13.59f, 4.75f, 15f, 4.75f)
                horizontalLineTo(17f)
                curveTo(18.41f, 4.75f, 19.25f, 5.59f, 19.25f, 7f)
                verticalLineTo(9f)
                curveTo(19.25f, 10.41f, 18.41f, 11.25f, 17f, 11.25f)
                close()
                moveTo(15f, 6.25f)
                curveTo(14.41f, 6.25f, 14.25f, 6.41f, 14.25f, 7f)
                verticalLineTo(9f)
                curveTo(14.25f, 9.59f, 14.41f, 9.75f, 15f, 9.75f)
                horizontalLineTo(17f)
                curveTo(17.59f, 9.75f, 17.75f, 9.59f, 17.75f, 9f)
                verticalLineTo(7f)
                curveTo(17.75f, 6.41f, 17.59f, 6.25f, 17f, 6.25f)
                horizontalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 19.25f)
                horizontalLineTo(7f)
                curveTo(5.59f, 19.25f, 4.75f, 18.41f, 4.75f, 17f)
                verticalLineTo(15f)
                curveTo(4.75f, 13.59f, 5.59f, 12.75f, 7f, 12.75f)
                horizontalLineTo(9f)
                curveTo(10.41f, 12.75f, 11.25f, 13.59f, 11.25f, 15f)
                verticalLineTo(17f)
                curveTo(11.25f, 18.41f, 10.41f, 19.25f, 9f, 19.25f)
                close()
                moveTo(7f, 14.25f)
                curveTo(6.41f, 14.25f, 6.25f, 14.41f, 6.25f, 15f)
                verticalLineTo(17f)
                curveTo(6.25f, 17.59f, 6.41f, 17.75f, 7f, 17.75f)
                horizontalLineTo(9f)
                curveTo(9.59f, 17.75f, 9.75f, 17.59f, 9.75f, 17f)
                verticalLineTo(15f)
                curveTo(9.75f, 14.41f, 9.59f, 14.25f, 9f, 14.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 19.25f)
                horizontalLineTo(15f)
                curveTo(13.59f, 19.25f, 12.75f, 18.41f, 12.75f, 17f)
                verticalLineTo(15f)
                curveTo(12.75f, 13.59f, 13.59f, 12.75f, 15f, 12.75f)
                horizontalLineTo(17f)
                curveTo(18.41f, 12.75f, 19.25f, 13.59f, 19.25f, 15f)
                verticalLineTo(17f)
                curveTo(19.25f, 18.41f, 18.41f, 19.25f, 17f, 19.25f)
                close()
                moveTo(15f, 14.25f)
                curveTo(14.41f, 14.25f, 14.25f, 14.41f, 14.25f, 15f)
                verticalLineTo(17f)
                curveTo(14.25f, 17.59f, 14.41f, 17.75f, 15f, 17.75f)
                horizontalLineTo(17f)
                curveTo(17.59f, 17.75f, 17.75f, 17.59f, 17.75f, 17f)
                verticalLineTo(15f)
                curveTo(17.75f, 14.41f, 17.59f, 14.25f, 17f, 14.25f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _ScanBarcode!!
    }

@Suppress("ObjectPropertyName")
private var _ScanBarcode: ImageVector? = null
