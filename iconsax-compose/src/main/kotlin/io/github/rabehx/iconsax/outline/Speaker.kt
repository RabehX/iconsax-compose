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

val Iconsax.Outline.Speaker: ImageVector
    get() {
        if (_Speaker != null) {
            return _Speaker!!
        }
        _Speaker = ImageVector.Builder(
            name = "Outline.Speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(5.58f, 22.75f, 4.25f, 21.42f, 4.25f, 18f)
                verticalLineTo(6f)
                curveTo(4.25f, 2.58f, 5.58f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(18.42f, 1.25f, 19.75f, 2.58f, 19.75f, 6f)
                verticalLineTo(18f)
                curveTo(19.75f, 21.42f, 18.42f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(6.42f, 2.75f, 5.75f, 3.42f, 5.75f, 6f)
                verticalLineTo(18f)
                curveTo(5.75f, 20.58f, 6.42f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(17.58f, 21.25f, 18.25f, 20.58f, 18.25f, 18f)
                verticalLineTo(6f)
                curveTo(18.25f, 3.42f, 17.58f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(9.93f, 18.75f, 8.25f, 17.07f, 8.25f, 15f)
                curveTo(8.25f, 12.93f, 9.93f, 11.25f, 12f, 11.25f)
                curveTo(14.07f, 11.25f, 15.75f, 12.93f, 15.75f, 15f)
                curveTo(15.75f, 17.07f, 14.07f, 18.75f, 12f, 18.75f)
                close()
                moveTo(12f, 12.75f)
                curveTo(10.76f, 12.75f, 9.75f, 13.76f, 9.75f, 15f)
                curveTo(9.75f, 16.24f, 10.76f, 17.25f, 12f, 17.25f)
                curveTo(13.24f, 17.25f, 14.25f, 16.24f, 14.25f, 15f)
                curveTo(14.25f, 13.76f, 13.24f, 12.75f, 12f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 8.74f, 9.75f, 7.5f)
                curveTo(9.75f, 6.26f, 10.76f, 5.25f, 12f, 5.25f)
                curveTo(13.24f, 5.25f, 14.25f, 6.26f, 14.25f, 7.5f)
                curveTo(14.25f, 8.74f, 13.24f, 9.75f, 12f, 9.75f)
                close()
                moveTo(12f, 6.75f)
                curveTo(11.59f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                curveTo(11.25f, 7.91f, 11.59f, 8.25f, 12f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 7.91f, 12.75f, 7.5f)
                curveTo(12.75f, 7.09f, 12.41f, 6.75f, 12f, 6.75f)
                close()
            }
        }.build()

        return _Speaker!!
    }

@Suppress("ObjectPropertyName")
private var _Speaker: ImageVector? = null
