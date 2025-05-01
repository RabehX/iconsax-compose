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


val Iconsax.Filled.Message: ImageVector
    get() {
        if (_Message != null) {
            return _Message!!
        }
        _Message = ImageVector.Builder(
            name = "Filled.Message",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4.24f, 2f, 2f, 4.23f, 2f, 6.98f)
                verticalLineTo(12.96f)
                verticalLineTo(13.96f)
                curveTo(2f, 16.71f, 4.24f, 18.94f, 7f, 18.94f)
                horizontalLineTo(8.5f)
                curveTo(8.77f, 18.94f, 9.13f, 19.12f, 9.3f, 19.34f)
                lineTo(10.8f, 21.33f)
                curveTo(11.46f, 22.21f, 12.54f, 22.21f, 13.2f, 21.33f)
                lineTo(14.7f, 19.34f)
                curveTo(14.89f, 19.09f, 15.19f, 18.94f, 15.5f, 18.94f)
                horizontalLineTo(17f)
                curveTo(19.76f, 18.94f, 22f, 16.71f, 22f, 13.96f)
                verticalLineTo(6.98f)
                curveTo(22f, 4.23f, 19.76f, 2f, 17f, 2f)
                close()
                moveTo(8f, 12f)
                curveTo(7.44f, 12f, 7f, 11.55f, 7f, 11f)
                curveTo(7f, 10.45f, 7.45f, 10f, 8f, 10f)
                curveTo(8.55f, 10f, 9f, 10.45f, 9f, 11f)
                curveTo(9f, 11.55f, 8.56f, 12f, 8f, 12f)
                close()
                moveTo(12f, 12f)
                curveTo(11.44f, 12f, 11f, 11.55f, 11f, 11f)
                curveTo(11f, 10.45f, 11.45f, 10f, 12f, 10f)
                curveTo(12.55f, 10f, 13f, 10.45f, 13f, 11f)
                curveTo(13f, 11.55f, 12.56f, 12f, 12f, 12f)
                close()
                moveTo(16f, 12f)
                curveTo(15.44f, 12f, 15f, 11.55f, 15f, 11f)
                curveTo(15f, 10.45f, 15.45f, 10f, 16f, 10f)
                curveTo(16.55f, 10f, 17f, 10.45f, 17f, 11f)
                curveTo(17f, 11.55f, 16.56f, 12f, 16f, 12f)
                close()
            }
        }.build()

        return _Message!!
    }

@Suppress("ObjectPropertyName")
private var _Message: ImageVector? = null
