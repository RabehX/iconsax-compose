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

val Iconsax.Outline.DocumentCode: ImageVector
    get() {
        if (_DocumentCode != null) {
            return _DocumentCode!!
        }
        _DocumentCode = ImageVector.Builder(
            name = "Outline.DocumentCode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(7f)
                curveTo(2.25f, 3.35f, 4.35f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(19.65f, 1.25f, 21.75f, 3.35f, 21.75f, 7f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.65f, 19.65f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(5.14f, 2.75f, 3.75f, 4.14f, 3.75f, 7f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.86f, 21.25f, 20.25f, 19.86f, 20.25f, 17f)
                verticalLineTo(7f)
                curveTo(20.25f, 4.14f, 18.86f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(14.98f, 9.25f, 13.75f, 8.02f, 13.75f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(13.75f, 4.09f, 14.09f, 3.75f, 14.5f, 3.75f)
                curveTo(14.91f, 3.75f, 15.25f, 4.09f, 15.25f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(15.25f, 7.19f, 15.81f, 7.75f, 16.5f, 7.75f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 7.75f, 19.25f, 8.09f, 19.25f, 8.5f)
                curveTo(19.25f, 8.91f, 18.91f, 9.25f, 18.5f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.999f, 17.75f)
                curveTo(9.809f, 17.75f, 9.619f, 17.68f, 9.469f, 17.53f)
                lineTo(7.469f, 15.53f)
                curveTo(7.179f, 15.24f, 7.179f, 14.76f, 7.469f, 14.47f)
                lineTo(9.469f, 12.47f)
                curveTo(9.759f, 12.18f, 10.24f, 12.18f, 10.53f, 12.47f)
                curveTo(10.819f, 12.76f, 10.819f, 13.24f, 10.53f, 13.53f)
                lineTo(9.059f, 15f)
                lineTo(10.53f, 16.47f)
                curveTo(10.819f, 16.76f, 10.819f, 17.24f, 10.53f, 17.53f)
                curveTo(10.38f, 17.68f, 10.189f, 17.75f, 9.999f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 17.75f)
                curveTo(13.809f, 17.75f, 13.62f, 17.68f, 13.469f, 17.53f)
                curveTo(13.179f, 17.24f, 13.179f, 16.76f, 13.469f, 16.47f)
                lineTo(14.939f, 15f)
                lineTo(13.469f, 13.53f)
                curveTo(13.179f, 13.24f, 13.179f, 12.76f, 13.469f, 12.47f)
                curveTo(13.759f, 12.18f, 14.24f, 12.18f, 14.53f, 12.47f)
                lineTo(16.529f, 14.47f)
                curveTo(16.819f, 14.76f, 16.819f, 15.24f, 16.529f, 15.53f)
                lineTo(14.53f, 17.53f)
                curveTo(14.38f, 17.68f, 14.189f, 17.75f, 14f, 17.75f)
                close()
            }
        }.build()

        return _DocumentCode!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCode: ImageVector? = null
