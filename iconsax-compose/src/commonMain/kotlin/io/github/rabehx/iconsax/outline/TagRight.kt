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

val Iconsax.Outline.TagRight: ImageVector
    get() {
        if (_TagRight != null) {
            return _TagRight!!
        }
        _TagRight = ImageVector.Builder(
            name = "Outline.TagRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.669f, 21.65f)
                horizontalLineTo(4.219f)
                curveTo(3.119f, 21.65f, 2.149f, 21.08f, 1.619f, 20.12f)
                curveTo(1.089f, 19.16f, 1.119f, 18.03f, 1.699f, 17.1f)
                lineTo(4.469f, 12.67f)
                curveTo(4.689f, 12.32f, 4.689f, 11.67f, 4.469f, 11.33f)
                lineTo(1.699f, 6.9f)
                curveTo(1.119f, 5.97f, 1.089f, 4.84f, 1.619f, 3.88f)
                curveTo(2.149f, 2.92f, 3.129f, 2.35f, 4.219f, 2.35f)
                horizontalLineTo(15.659f)
                curveTo(16.599f, 2.35f, 17.689f, 2.95f, 18.179f, 3.75f)
                lineTo(22.359f, 10.43f)
                curveTo(22.919f, 11.33f, 22.869f, 12.71f, 22.229f, 13.56f)
                lineTo(17.049f, 20.46f)
                curveTo(16.539f, 21.14f, 15.519f, 21.65f, 14.669f, 21.65f)
                close()
                moveTo(4.219f, 3.85f)
                curveTo(3.679f, 3.85f, 3.189f, 4.13f, 2.929f, 4.61f)
                curveTo(2.669f, 5.09f, 2.679f, 5.65f, 2.969f, 6.11f)
                lineTo(5.739f, 10.54f)
                curveTo(6.259f, 11.38f, 6.259f, 12.64f, 5.739f, 13.48f)
                lineTo(2.969f, 17.91f)
                curveTo(2.679f, 18.37f, 2.669f, 18.93f, 2.929f, 19.41f)
                curveTo(3.189f, 19.89f, 3.679f, 20.17f, 4.219f, 20.17f)
                horizontalLineTo(14.669f)
                curveTo(15.049f, 20.17f, 15.619f, 19.88f, 15.849f, 19.58f)
                lineTo(21.029f, 12.68f)
                curveTo(21.299f, 12.32f, 21.33f, 11.63f, 21.09f, 11.25f)
                lineTo(16.909f, 4.57f)
                curveTo(16.689f, 4.21f, 16.079f, 3.88f, 15.659f, 3.88f)
                horizontalLineTo(4.219f)
                verticalLineTo(3.85f)
                close()
            }
        }.build()

        return _TagRight!!
    }

@Suppress("ObjectPropertyName")
private var _TagRight: ImageVector? = null
