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


val Iconsax.Filled.PenTool: ImageVector
    get() {
        if (_PenTool != null) {
            return _PenTool!!
        }
        _PenTool = ImageVector.Builder(
            name = "Filled.PenTool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.549f, 9.439f)
                horizontalLineTo(19.449f)
                curveTo(19.299f, 9.439f, 19.149f, 9.469f, 19.009f, 9.509f)
                lineTo(14.019f, 4.519f)
                curveTo(14.499f, 3.899f, 14.459f, 3.009f, 13.889f, 2.449f)
                lineTo(13.109f, 1.669f)
                curveTo(12.519f, 1.079f, 11.479f, 1.079f, 10.879f, 1.669f)
                lineTo(10.099f, 2.449f)
                curveTo(9.539f, 3.009f, 9.499f, 3.899f, 9.979f, 4.519f)
                lineTo(4.989f, 9.509f)
                curveTo(4.849f, 9.469f, 4.699f, 9.439f, 4.549f, 9.439f)
                horizontalLineTo(3.449f)
                curveTo(2.579f, 9.439f, 1.869f, 10.149f, 1.869f, 11.019f)
                verticalLineTo(12.119f)
                curveTo(1.869f, 12.989f, 2.579f, 13.699f, 3.449f, 13.699f)
                horizontalLineTo(4.549f)
                curveTo(5.419f, 13.699f, 6.129f, 12.989f, 6.129f, 12.119f)
                verticalLineTo(11.019f)
                curveTo(6.129f, 10.869f, 6.099f, 10.719f, 6.059f, 10.579f)
                lineTo(11.049f, 5.589f)
                curveTo(11.319f, 5.799f, 11.659f, 5.909f, 11.999f, 5.909f)
                curveTo(12.339f, 5.909f, 12.679f, 5.789f, 12.959f, 5.579f)
                lineTo(17.949f, 10.569f)
                curveTo(17.909f, 10.709f, 17.879f, 10.859f, 17.879f, 11.009f)
                verticalLineTo(12.109f)
                curveTo(17.879f, 12.979f, 18.589f, 13.689f, 19.459f, 13.689f)
                horizontalLineTo(20.559f)
                curveTo(21.429f, 13.689f, 22.139f, 12.979f, 22.139f, 12.109f)
                verticalLineTo(11.009f)
                curveTo(22.119f, 10.139f, 21.419f, 9.439f, 20.549f, 9.439f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.749f, 16.549f)
                lineTo(14.109f, 17.999f)
                horizontalLineTo(9.849f)
                lineTo(8.209f, 16.549f)
                curveTo(7.259f, 15.769f, 7.259f, 15.169f, 7.979f, 14.249f)
                lineTo(10.869f, 10.589f)
                curveTo(11.069f, 10.339f, 11.299f, 10.169f, 11.559f, 10.079f)
                curveTo(11.829f, 9.989f, 12.119f, 9.989f, 12.399f, 10.079f)
                curveTo(12.649f, 10.169f, 12.879f, 10.339f, 13.089f, 10.589f)
                lineTo(15.979f, 14.249f)
                curveTo(16.699f, 15.159f, 16.669f, 15.729f, 15.749f, 16.549f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.291f, 22f)
                horizontalLineTo(10.701f)
                curveTo(9.781f, 22f, 9.091f, 21.25f, 9.271f, 20.45f)
                lineTo(9.581f, 19.06f)
                curveTo(9.641f, 18.78f, 9.891f, 18.59f, 10.171f, 18.59f)
                horizontalLineTo(13.821f)
                curveTo(14.101f, 18.59f, 14.341f, 18.78f, 14.411f, 19.06f)
                lineTo(14.721f, 20.45f)
                curveTo(14.921f, 21.3f, 14.271f, 22f, 13.291f, 22f)
                close()
            }
        }.build()

        return _PenTool!!
    }

@Suppress("ObjectPropertyName")
private var _PenTool: ImageVector? = null
