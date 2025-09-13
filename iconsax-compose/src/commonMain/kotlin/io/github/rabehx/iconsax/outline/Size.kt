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

val Iconsax.Outline.Size: ImageVector
    get() {
        if (_Size != null) {
            return _Size!!
        }
        _Size = ImageVector.Builder(
            name = "Outline.Size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.721f, 22.75f)
                horizontalLineTo(7.221f)
                curveTo(3.071f, 22.75f, 1.221f, 20.9f, 1.221f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.221f, 8.1f, 3.071f, 6.25f, 7.221f, 6.25f)
                horizontalLineTo(11.721f)
                curveTo(15.871f, 6.25f, 17.721f, 8.1f, 17.721f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(17.721f, 20.9f, 15.871f, 22.75f, 11.721f, 22.75f)
                close()
                moveTo(7.221f, 7.75f)
                curveTo(3.901f, 7.75f, 2.721f, 8.93f, 2.721f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2.721f, 20.07f, 3.901f, 21.25f, 7.221f, 21.25f)
                horizontalLineTo(11.721f)
                curveTo(15.041f, 21.25f, 16.221f, 20.07f, 16.221f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(16.221f, 8.93f, 15.041f, 7.75f, 11.721f, 7.75f)
                horizontalLineTo(7.221f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.121f, 13.75f)
                horizontalLineTo(16.971f)
                curveTo(16.561f, 13.75f, 16.221f, 13.41f, 16.221f, 13f)
                verticalLineTo(12.25f)
                curveTo(16.221f, 8.93f, 15.041f, 7.75f, 11.721f, 7.75f)
                horizontalLineTo(10.971f)
                curveTo(10.561f, 7.75f, 10.221f, 7.41f, 10.221f, 7f)
                verticalLineTo(5.85f)
                curveTo(10.221f, 2.67f, 11.641f, 1.25f, 14.821f, 1.25f)
                horizontalLineTo(18.121f)
                curveTo(21.301f, 1.25f, 22.721f, 2.67f, 22.721f, 5.85f)
                verticalLineTo(9.15f)
                curveTo(22.721f, 12.33f, 21.301f, 13.75f, 18.121f, 13.75f)
                close()
                moveTo(17.721f, 12.25f)
                horizontalLineTo(18.121f)
                curveTo(20.471f, 12.25f, 21.221f, 11.5f, 21.221f, 9.15f)
                verticalLineTo(5.85f)
                curveTo(21.221f, 3.5f, 20.471f, 2.75f, 18.121f, 2.75f)
                horizontalLineTo(14.821f)
                curveTo(12.471f, 2.75f, 11.721f, 3.5f, 11.721f, 5.85f)
                verticalLineTo(6.25f)
                curveTo(15.871f, 6.25f, 17.721f, 8.1f, 17.721f, 12.25f)
                close()
            }
        }.build()

        return _Size!!
    }

@Suppress("ObjectPropertyName")
private var _Size: ImageVector? = null
