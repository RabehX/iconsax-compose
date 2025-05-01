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


val Iconsax.Filled.MouseSquare: ImageVector
    get() {
        if (_MouseSquare != null) {
            return _MouseSquare!!
        }
        _MouseSquare = ImageVector.Builder(
            name = "Filled.MouseSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 7.52f)
                verticalLineTo(13.4f)
                curveTo(21f, 13.74f, 20.67f, 13.98f, 20.35f, 13.88f)
                lineTo(16.42f, 12.66f)
                curveTo(15.34f, 12.33f, 14.18f, 12.61f, 13.39f, 13.4f)
                curveTo(12.59f, 14.2f, 12.3f, 15.37f, 12.64f, 16.45f)
                lineTo(13.85f, 20.35f)
                curveTo(13.95f, 20.67f, 13.71f, 21f, 13.37f, 21f)
                horizontalLineTo(7.52f)
                curveTo(4.07f, 21f, 2f, 18.94f, 2f, 15.48f)
                verticalLineTo(7.52f)
                curveTo(2f, 4.06f, 4.07f, 2f, 7.52f, 2f)
                horizontalLineTo(15.48f)
                curveTo(18.93f, 2f, 21f, 4.06f, 21f, 7.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.96f, 18.838f)
                lineTo(20.33f, 19.389f)
                curveTo(19.88f, 19.538f, 19.52f, 19.889f, 19.37f, 20.348f)
                lineTo(18.82f, 21.979f)
                curveTo(18.35f, 23.389f, 16.37f, 23.358f, 15.93f, 21.948f)
                lineTo(14.08f, 15.998f)
                curveTo(13.72f, 14.818f, 14.81f, 13.719f, 15.98f, 14.089f)
                lineTo(21.94f, 15.939f)
                curveTo(23.34f, 16.378f, 23.36f, 18.368f, 21.96f, 18.838f)
                close()
            }
        }.build()

        return _MouseSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MouseSquare: ImageVector? = null
