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

val Iconsax.Outline.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Outline.Code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.891f, 15.75f)
                curveTo(6.611f, 15.75f, 6.351f, 15.6f, 6.221f, 15.34f)
                curveTo(6.031f, 14.97f, 6.181f, 14.52f, 6.561f, 14.33f)
                curveTo(7.431f, 13.9f, 8.171f, 13.24f, 8.701f, 12.44f)
                curveTo(8.881f, 12.17f, 8.881f, 11.83f, 8.701f, 11.56f)
                curveTo(8.161f, 10.76f, 7.421f, 10.1f, 6.561f, 9.67f)
                curveTo(6.181f, 9.49f, 6.031f, 9.04f, 6.221f, 8.66f)
                curveTo(6.401f, 8.29f, 6.851f, 8.14f, 7.221f, 8.33f)
                curveTo(8.321f, 8.88f, 9.261f, 9.71f, 9.941f, 10.73f)
                curveTo(10.451f, 11.5f, 10.451f, 12.5f, 9.941f, 13.27f)
                curveTo(9.261f, 14.29f, 8.321f, 15.12f, 7.221f, 15.67f)
                curveTo(7.121f, 15.72f, 7.001f, 15.75f, 6.891f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 15.75f)
                horizontalLineTo(13f)
                curveTo(12.59f, 15.75f, 12.25f, 15.41f, 12.25f, 15f)
                curveTo(12.25f, 14.59f, 12.59f, 14.25f, 13f, 14.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null
