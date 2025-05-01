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

val Iconsax.Outline.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Outline.Ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 17.75f)
                horizontalLineTo(5f)
                curveTo(2.58f, 17.75f, 1.25f, 16.42f, 1.25f, 14f)
                verticalLineTo(10f)
                curveTo(1.25f, 7.58f, 2.58f, 6.25f, 5f, 6.25f)
                horizontalLineTo(19f)
                curveTo(21.42f, 6.25f, 22.75f, 7.58f, 22.75f, 10f)
                verticalLineTo(14f)
                curveTo(22.75f, 16.42f, 21.42f, 17.75f, 19f, 17.75f)
                close()
                moveTo(5f, 7.75f)
                curveTo(3.42f, 7.75f, 2.75f, 8.42f, 2.75f, 10f)
                verticalLineTo(14f)
                curveTo(2.75f, 15.58f, 3.42f, 16.25f, 5f, 16.25f)
                horizontalLineTo(19f)
                curveTo(20.58f, 16.25f, 21.25f, 15.58f, 21.25f, 14f)
                verticalLineTo(10f)
                curveTo(21.25f, 8.42f, 20.58f, 7.75f, 19f, 7.75f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 12.75f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12f)
                verticalLineTo(7f)
                curveTo(17.25f, 6.59f, 17.59f, 6.25f, 18f, 6.25f)
                curveTo(18.41f, 6.25f, 18.75f, 6.59f, 18.75f, 7f)
                verticalLineTo(12f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 11.75f)
                curveTo(5.59f, 11.75f, 5.25f, 11.41f, 5.25f, 11f)
                verticalLineTo(7f)
                curveTo(5.25f, 6.59f, 5.59f, 6.25f, 6f, 6.25f)
                curveTo(6.41f, 6.25f, 6.75f, 6.59f, 6.75f, 7f)
                verticalLineTo(11f)
                curveTo(6.75f, 11.41f, 6.41f, 11.75f, 6f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 12.75f)
                curveTo(9.58f, 12.75f, 9.25f, 12.41f, 9.25f, 11.99f)
                lineTo(9.3f, 6.99f)
                curveTo(9.3f, 6.58f, 9.64f, 6.25f, 10.05f, 6.25f)
                curveTo(10.05f, 6.25f, 10.05f, 6.25f, 10.06f, 6.25f)
                curveTo(10.47f, 6.25f, 10.81f, 6.59f, 10.8f, 7.01f)
                lineTo(10.75f, 12.01f)
                curveTo(10.75f, 12.42f, 10.41f, 12.75f, 10f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 10.75f)
                curveTo(13.59f, 10.75f, 13.25f, 10.41f, 13.25f, 10f)
                verticalLineTo(7f)
                curveTo(13.25f, 6.59f, 13.59f, 6.25f, 14f, 6.25f)
                curveTo(14.41f, 6.25f, 14.75f, 6.59f, 14.75f, 7f)
                verticalLineTo(10f)
                curveTo(14.75f, 10.41f, 14.41f, 10.75f, 14f, 10.75f)
                close()
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
