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


val Iconsax.Filled.Signpost: ImageVector
    get() {
        if (_Signpost != null) {
            return _Signpost!!
        }
        _Signpost = ImageVector.Builder(
            name = "Filled.Signpost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.34f, 14.13f)
                lineTo(16.16f, 12.38f)
                curveTo(15.85f, 12.14f, 15.46f, 12f, 15.06f, 12f)
                horizontalLineTo(12.75f)
                verticalLineTo(9f)
                horizontalLineTo(17.22f)
                curveTo(18.19f, 9f, 18.97f, 8.22f, 18.97f, 7.25f)
                verticalLineTo(3.75f)
                curveTo(18.97f, 2.78f, 18.19f, 2f, 17.22f, 2f)
                horizontalLineTo(8.96f)
                curveTo(8.57f, 2f, 8.18f, 2.14f, 7.87f, 2.38f)
                lineTo(5.68f, 4.13f)
                curveTo(4.81f, 4.83f, 4.81f, 6.17f, 5.68f, 6.87f)
                lineTo(7.87f, 8.62f)
                curveTo(8.18f, 8.86f, 8.57f, 9f, 8.96f, 9f)
                horizontalLineTo(11.25f)
                verticalLineTo(12f)
                horizontalLineTo(6.8f)
                curveTo(5.83f, 12f, 5.05f, 12.78f, 5.05f, 13.75f)
                verticalLineTo(17.25f)
                curveTo(5.05f, 18.22f, 5.83f, 19f, 6.8f, 19f)
                horizontalLineTo(11.25f)
                verticalLineTo(21.25f)
                horizontalLineTo(9f)
                curveTo(8.59f, 21.25f, 8.25f, 21.59f, 8.25f, 22f)
                curveTo(8.25f, 22.41f, 8.59f, 22.75f, 9f, 22.75f)
                horizontalLineTo(15f)
                curveTo(15.41f, 22.75f, 15.75f, 22.41f, 15.75f, 22f)
                curveTo(15.75f, 21.59f, 15.41f, 21.25f, 15f, 21.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(19f)
                horizontalLineTo(15.06f)
                curveTo(15.46f, 19f, 15.85f, 18.86f, 16.16f, 18.62f)
                lineTo(18.34f, 16.87f)
                curveTo(19.22f, 16.17f, 19.22f, 14.83f, 18.34f, 14.13f)
                close()
            }
        }.build()

        return _Signpost!!
    }

@Suppress("ObjectPropertyName")
private var _Signpost: ImageVector? = null
