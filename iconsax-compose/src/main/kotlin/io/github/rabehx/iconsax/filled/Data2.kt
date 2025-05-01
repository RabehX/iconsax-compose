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


val Iconsax.Filled.Data2: ImageVector
    get() {
        if (_Data2 != null) {
            return _Data2!!
        }
        _Data2 = ImageVector.Builder(
            name = "Filled.Data2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 8f)
                horizontalLineTo(4f)
                curveTo(2.9f, 8f, 2f, 7.1f, 2f, 6f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(7f)
                curveTo(8.1f, 2f, 9f, 2.9f, 9f, 4f)
                verticalLineTo(6f)
                curveTo(9f, 7.1f, 8.1f, 8f, 7f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.8f, 7f)
                horizontalLineTo(17.2f)
                curveTo(16.54f, 7f, 16f, 6.46f, 16f, 5.8f)
                verticalLineTo(4.2f)
                curveTo(16f, 3.54f, 16.54f, 3f, 17.2f, 3f)
                horizontalLineTo(20.8f)
                curveTo(21.46f, 3f, 22f, 3.54f, 22f, 4.2f)
                verticalLineTo(5.8f)
                curveTo(22f, 6.46f, 21.46f, 7f, 20.8f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.8f, 14.5f)
                horizontalLineTo(17.2f)
                curveTo(16.54f, 14.5f, 16f, 13.96f, 16f, 13.3f)
                verticalLineTo(11.7f)
                curveTo(16f, 11.04f, 16.54f, 10.5f, 17.2f, 10.5f)
                horizontalLineTo(20.8f)
                curveTo(21.46f, 10.5f, 22f, 11.04f, 22f, 11.7f)
                verticalLineTo(13.3f)
                curveTo(22f, 13.96f, 21.46f, 14.5f, 20.8f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.96f,
                strokeAlpha = 0.96f
            ) {
                moveTo(16f, 13.25f)
                curveTo(16.41f, 13.25f, 16.75f, 12.91f, 16.75f, 12.5f)
                curveTo(16.75f, 12.09f, 16.41f, 11.75f, 16f, 11.75f)
                horizontalLineTo(13.25f)
                verticalLineTo(5.75f)
                horizontalLineTo(16f)
                curveTo(16.41f, 5.75f, 16.75f, 5.41f, 16.75f, 5f)
                curveTo(16.75f, 4.59f, 16.41f, 4.25f, 16f, 4.25f)
                horizontalLineTo(9f)
                curveTo(8.59f, 4.25f, 8.25f, 4.59f, 8.25f, 5f)
                curveTo(8.25f, 5.41f, 8.59f, 5.75f, 9f, 5.75f)
                horizontalLineTo(11.75f)
                verticalLineTo(18f)
                curveTo(11.75f, 19.52f, 12.98f, 20.75f, 14.5f, 20.75f)
                horizontalLineTo(16f)
                curveTo(16.41f, 20.75f, 16.75f, 20.41f, 16.75f, 20f)
                curveTo(16.75f, 19.59f, 16.41f, 19.25f, 16f, 19.25f)
                horizontalLineTo(14.5f)
                curveTo(13.81f, 19.25f, 13.25f, 18.69f, 13.25f, 18f)
                verticalLineTo(13.25f)
                horizontalLineTo(16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.8f, 22f)
                horizontalLineTo(17.2f)
                curveTo(16.54f, 22f, 16f, 21.46f, 16f, 20.8f)
                verticalLineTo(19.2f)
                curveTo(16f, 18.54f, 16.54f, 18f, 17.2f, 18f)
                horizontalLineTo(20.8f)
                curveTo(21.46f, 18f, 22f, 18.54f, 22f, 19.2f)
                verticalLineTo(20.8f)
                curveTo(22f, 21.46f, 21.46f, 22f, 20.8f, 22f)
                close()
            }
        }.build()

        return _Data2!!
    }

@Suppress("ObjectPropertyName")
private var _Data2: ImageVector? = null
