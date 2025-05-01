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


val Iconsax.Filled.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Filled.Ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 7f)
                curveTo(18.86f, 7f, 18.75f, 7.11f, 18.75f, 7.25f)
                verticalLineTo(12f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18f, 12.75f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12f)
                verticalLineTo(7.25f)
                curveTo(17.25f, 7.11f, 17.14f, 7f, 17f, 7f)
                horizontalLineTo(15f)
                curveTo(14.86f, 7f, 14.75f, 7.11f, 14.75f, 7.25f)
                verticalLineTo(9.6f)
                curveTo(14.75f, 10.01f, 14.41f, 10.35f, 14f, 10.35f)
                curveTo(13.59f, 10.35f, 13.25f, 10.01f, 13.25f, 9.6f)
                verticalLineTo(7.25f)
                curveTo(13.25f, 7.11f, 13.14f, 7f, 13f, 7f)
                horizontalLineTo(11.04f)
                curveTo(10.9f, 7f, 10.79f, 7.11f, 10.79f, 7.25f)
                lineTo(10.75f, 12.01f)
                curveTo(10.75f, 12.42f, 10.41f, 12.75f, 10f, 12.75f)
                curveTo(10f, 12.75f, 10f, 12.75f, 9.99f, 12.75f)
                curveTo(9.58f, 12.75f, 9.25f, 12.41f, 9.25f, 11.99f)
                lineTo(9.29f, 7.25f)
                curveTo(9.29f, 7.11f, 9.18f, 7f, 9.04f, 7f)
                horizontalLineTo(7f)
                curveTo(6.86f, 7f, 6.75f, 7.11f, 6.75f, 7.25f)
                verticalLineTo(10.8f)
                curveTo(6.75f, 11.21f, 6.41f, 11.55f, 6f, 11.55f)
                curveTo(5.59f, 11.55f, 5.25f, 11.21f, 5.25f, 10.8f)
                verticalLineTo(7.25f)
                curveTo(5.25f, 7.11f, 5.14f, 7f, 5f, 7f)
                curveTo(3.34f, 7f, 2f, 8.34f, 2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 15.66f, 3.34f, 17f, 5f, 17f)
                horizontalLineTo(19f)
                curveTo(20.66f, 17f, 22f, 15.66f, 22f, 14f)
                verticalLineTo(10f)
                curveTo(22f, 8.34f, 20.66f, 7f, 19f, 7f)
                close()
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
