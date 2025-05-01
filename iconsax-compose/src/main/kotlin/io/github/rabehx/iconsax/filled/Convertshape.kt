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


val Iconsax.Filled.Convertshape: ImageVector
    get() {
        if (_Convertshape != null) {
            return _Convertshape!!
        }
        _Convertshape = ImageVector.Builder(
            name = "Filled.Convertshape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 5.15f)
                verticalLineTo(8.85f)
                curveTo(22f, 11.1f, 21.1f, 12f, 18.85f, 12f)
                horizontalLineTo(16.15f)
                curveTo(13.9f, 12f, 13f, 11.1f, 13f, 8.85f)
                verticalLineTo(5.15f)
                curveTo(13f, 2.9f, 13.9f, 2f, 16.15f, 2f)
                horizontalLineTo(18.85f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 5.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 15.15f)
                verticalLineTo(18.85f)
                curveTo(11f, 21.1f, 10.1f, 22f, 7.85f, 22f)
                horizontalLineTo(5.15f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 18.85f)
                verticalLineTo(15.15f)
                curveTo(2f, 12.9f, 2.9f, 12f, 5.15f, 12f)
                horizontalLineTo(7.85f)
                curveTo(10.1f, 12f, 11f, 12.9f, 11f, 15.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.78f, 22f)
                curveTo(14.509f, 22f, 14.259f, 21.85f, 14.13f, 21.619f)
                curveTo(14f, 21.379f, 14f, 21.1f, 14.139f, 20.86f)
                lineTo(15.109f, 19.24f)
                curveTo(15.319f, 18.879f, 15.78f, 18.77f, 16.139f, 18.979f)
                curveTo(16.5f, 19.19f, 16.61f, 19.649f, 16.399f, 20.01f)
                lineTo(16.219f, 20.309f)
                curveTo(18.69f, 19.67f, 20.51f, 17.43f, 20.51f, 14.769f)
                curveTo(20.51f, 14.359f, 20.85f, 14.019f, 21.26f, 14.019f)
                curveTo(21.67f, 14.019f, 22f, 14.359f, 22f, 14.78f)
                curveTo(22f, 18.76f, 18.76f, 22f, 14.78f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.75f, 9.97f)
                curveTo(2.34f, 9.97f, 2f, 9.64f, 2f, 9.22f)
                curveTo(2f, 5.24f, 5.24f, 2f, 9.22f, 2f)
                curveTo(9.5f, 2f, 9.74f, 2.15f, 9.88f, 2.38f)
                curveTo(10.01f, 2.62f, 10.01f, 2.9f, 9.87f, 3.14f)
                lineTo(8.9f, 4.75f)
                curveTo(8.68f, 5.11f, 8.22f, 5.23f, 7.87f, 5.01f)
                curveTo(7.51f, 4.8f, 7.4f, 4.34f, 7.61f, 3.98f)
                lineTo(7.79f, 3.68f)
                curveTo(5.33f, 4.32f, 3.5f, 6.56f, 3.5f, 9.22f)
                curveTo(3.5f, 9.64f, 3.16f, 9.97f, 2.75f, 9.97f)
                close()
            }
        }.build()

        return _Convertshape!!
    }

@Suppress("ObjectPropertyName")
private var _Convertshape: ImageVector? = null
