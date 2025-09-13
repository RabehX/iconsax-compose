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

val Iconsax.Outline.Like1: ImageVector
    get() {
        if (_Like1 != null) {
            return _Like1!!
        }
        _Like1 = ImageVector.Builder(
            name = "Outline.Like1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.279f, 22.1f)
                horizontalLineTo(12.479f)
                curveTo(11.919f, 22.1f, 10.699f, 21.93f, 10.049f, 21.28f)
                lineTo(7.019f, 18.94f)
                lineTo(7.939f, 17.75f)
                lineTo(11.039f, 20.15f)
                curveTo(11.289f, 20.39f, 11.919f, 20.59f, 12.479f, 20.59f)
                horizontalLineTo(16.279f)
                curveTo(17.179f, 20.59f, 18.149f, 19.87f, 18.349f, 19.06f)
                lineTo(20.769f, 11.71f)
                curveTo(20.929f, 11.27f, 20.899f, 10.87f, 20.689f, 10.58f)
                curveTo(20.469f, 10.27f, 20.069f, 10.09f, 19.579f, 10.09f)
                horizontalLineTo(15.579f)
                curveTo(15.059f, 10.09f, 14.579f, 9.87f, 14.249f, 9.49f)
                curveTo(13.909f, 9.1f, 13.759f, 8.58f, 13.839f, 8.04f)
                lineTo(14.339f, 4.83f)
                curveTo(14.459f, 4.27f, 14.079f, 3.64f, 13.539f, 3.46f)
                curveTo(13.049f, 3.28f, 12.419f, 3.54f, 12.199f, 3.86f)
                lineTo(8.099f, 9.96f)
                lineTo(6.859f, 9.13f)
                lineTo(10.959f, 3.03f)
                curveTo(11.589f, 2.09f, 12.969f, 1.64f, 14.049f, 2.05f)
                curveTo(15.299f, 2.46f, 16.099f, 3.84f, 15.819f, 5.12f)
                lineTo(15.329f, 8.27f)
                curveTo(15.319f, 8.34f, 15.319f, 8.44f, 15.389f, 8.52f)
                curveTo(15.439f, 8.57f, 15.509f, 8.6f, 15.589f, 8.6f)
                horizontalLineTo(19.589f)
                curveTo(20.569f, 8.6f, 21.419f, 9.01f, 21.919f, 9.72f)
                curveTo(22.409f, 10.41f, 22.509f, 11.32f, 22.189f, 12.2f)
                lineTo(19.799f, 19.48f)
                curveTo(19.429f, 20.93f, 17.889f, 22.1f, 16.279f, 22.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.381f, 21f)
                horizontalLineTo(4.381f)
                curveTo(2.531f, 21f, 1.631f, 20.13f, 1.631f, 18.35f)
                verticalLineTo(8.55f)
                curveTo(1.631f, 6.77f, 2.531f, 5.9f, 4.381f, 5.9f)
                horizontalLineTo(5.381f)
                curveTo(7.231f, 5.9f, 8.131f, 6.77f, 8.131f, 8.55f)
                verticalLineTo(18.35f)
                curveTo(8.131f, 20.13f, 7.231f, 21f, 5.381f, 21f)
                close()
                moveTo(4.381f, 7.4f)
                curveTo(3.291f, 7.4f, 3.131f, 7.66f, 3.131f, 8.55f)
                verticalLineTo(18.35f)
                curveTo(3.131f, 19.24f, 3.291f, 19.5f, 4.381f, 19.5f)
                horizontalLineTo(5.381f)
                curveTo(6.471f, 19.5f, 6.631f, 19.24f, 6.631f, 18.35f)
                verticalLineTo(8.55f)
                curveTo(6.631f, 7.66f, 6.471f, 7.4f, 5.381f, 7.4f)
                horizontalLineTo(4.381f)
                close()
            }
        }.build()

        return _Like1!!
    }

@Suppress("ObjectPropertyName")
private var _Like1: ImageVector? = null
