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

val Iconsax.Outline.Crop: ImageVector
    get() {
        if (_Crop != null) {
            return _Crop!!
        }
        _Crop = ImageVector.Builder(
            name = "Outline.Crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 19.75f)
                horizontalLineTo(9.9f)
                curveTo(5.57f, 19.75f, 4.25f, 18.43f, 4.25f, 14.1f)
                verticalLineTo(5f)
                curveTo(4.25f, 4.59f, 4.59f, 4.25f, 5f, 4.25f)
                horizontalLineTo(14.1f)
                curveTo(18.43f, 4.25f, 19.75f, 5.57f, 19.75f, 9.9f)
                verticalLineTo(19f)
                curveTo(19.75f, 19.41f, 19.41f, 19.75f, 19f, 19.75f)
                close()
                moveTo(5.75f, 5.75f)
                verticalLineTo(14.1f)
                curveTo(5.75f, 17.59f, 6.41f, 18.25f, 9.9f, 18.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(9.9f)
                curveTo(18.25f, 6.41f, 17.59f, 5.75f, 14.1f, 5.75f)
                horizontalLineTo(5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 5.75f)
                curveTo(4.59f, 5.75f, 4.25f, 5.41f, 4.25f, 5f)
                verticalLineTo(2f)
                curveTo(4.25f, 1.59f, 4.59f, 1.25f, 5f, 1.25f)
                curveTo(5.41f, 1.25f, 5.75f, 1.59f, 5.75f, 2f)
                verticalLineTo(5f)
                curveTo(5.75f, 5.41f, 5.41f, 5.75f, 5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 5.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 5.75f, 1.25f, 5.41f, 1.25f, 5f)
                curveTo(1.25f, 4.59f, 1.59f, 4.25f, 2f, 4.25f)
                horizontalLineTo(5f)
                curveTo(5.41f, 4.25f, 5.75f, 4.59f, 5.75f, 5f)
                curveTo(5.75f, 5.41f, 5.41f, 5.75f, 5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(18.59f, 22.75f, 18.25f, 22.41f, 18.25f, 22f)
                verticalLineTo(19f)
                curveTo(18.25f, 18.59f, 18.59f, 18.25f, 19f, 18.25f)
                curveTo(19.41f, 18.25f, 19.75f, 18.59f, 19.75f, 19f)
                verticalLineTo(22f)
                curveTo(19.75f, 22.41f, 19.41f, 22.75f, 19f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 19.75f)
                horizontalLineTo(19f)
                curveTo(18.59f, 19.75f, 18.25f, 19.41f, 18.25f, 19f)
                curveTo(18.25f, 18.59f, 18.59f, 18.25f, 19f, 18.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 18.25f, 22.75f, 18.59f, 22.75f, 19f)
                curveTo(22.75f, 19.41f, 22.41f, 19.75f, 22f, 19.75f)
                close()
            }
        }.build()

        return _Crop!!
    }

@Suppress("ObjectPropertyName")
private var _Crop: ImageVector? = null
