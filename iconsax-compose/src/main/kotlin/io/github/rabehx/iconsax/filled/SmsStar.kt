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


val Iconsax.Filled.SmsStar: ImageVector
    get() {
        if (_SmsStar != null) {
            return _SmsStar!!
        }
        _SmsStar = ImageVector.Builder(
            name = "Filled.SmsStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.481f, 2.819f)
                lineTo(19.761f, 3.389f)
                curveTo(19.901f, 3.669f, 20.251f, 3.929f, 20.561f, 3.989f)
                lineTo(20.941f, 4.049f)
                curveTo(22.081f, 4.239f, 22.351f, 5.079f, 21.531f, 5.909f)
                lineTo(21.181f, 6.259f)
                curveTo(20.951f, 6.499f, 20.821f, 6.959f, 20.891f, 7.279f)
                lineTo(20.941f, 7.489f)
                curveTo(21.251f, 8.869f, 20.521f, 9.399f, 19.321f, 8.679f)
                lineTo(19.061f, 8.529f)
                curveTo(18.751f, 8.349f, 18.251f, 8.349f, 17.941f, 8.529f)
                lineTo(17.681f, 8.679f)
                curveTo(16.471f, 9.409f, 15.741f, 8.869f, 16.061f, 7.489f)
                lineTo(16.111f, 7.279f)
                curveTo(16.181f, 6.959f, 16.051f, 6.499f, 15.821f, 6.259f)
                lineTo(15.471f, 5.899f)
                curveTo(14.651f, 5.069f, 14.921f, 4.229f, 16.061f, 4.039f)
                lineTo(16.441f, 3.979f)
                curveTo(16.741f, 3.929f, 17.101f, 3.659f, 17.241f, 3.379f)
                lineTo(17.521f, 2.809f)
                curveTo(18.061f, 1.729f, 18.941f, 1.729f, 19.481f, 2.819f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.57f, 10.09f)
                curveTo(21.21f, 10.35f, 20.2f, 10.83f, 18.76f, 10.09f)
                curveTo(18.6f, 10.01f, 18.4f, 10f, 18.24f, 10.09f)
                curveTo(17.67f, 10.38f, 17.15f, 10.5f, 16.74f, 10.5f)
                curveTo(16.1f, 10.5f, 15.65f, 10.25f, 15.43f, 10.09f)
                curveTo(15.06f, 9.82f, 14.28f, 9.05f, 14.55f, 7.42f)
                curveTo(14.58f, 7.25f, 14.53f, 7.08f, 14.42f, 6.95f)
                curveTo(13.73f, 6.16f, 13.35f, 5.1f, 13.62f, 4.27f)
                curveTo(13.72f, 3.94f, 13.51f, 3.5f, 13.17f, 3.5f)
                horizontalLineTo(7f)
                curveTo(4f, 3.5f, 2f, 5f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 19f, 4f, 20.5f, 7f, 20.5f)
                horizontalLineTo(17f)
                curveTo(20f, 20.5f, 22f, 19f, 22f, 15.5f)
                verticalLineTo(10.27f)
                curveTo(22f, 10.08f, 21.73f, 9.98f, 21.57f, 10.09f)
                close()
                moveTo(14.34f, 12.09f)
                curveTo(13.68f, 12.62f, 12.84f, 12.88f, 12f, 12.88f)
                curveTo(11.16f, 12.88f, 10.31f, 12.62f, 9.66f, 12.09f)
                lineTo(6.53f, 9.59f)
                curveTo(6.21f, 9.33f, 6.16f, 8.85f, 6.41f, 8.53f)
                curveTo(6.67f, 8.21f, 7.14f, 8.15f, 7.46f, 8.41f)
                lineTo(10.59f, 10.91f)
                curveTo(11.35f, 11.52f, 12.64f, 11.52f, 13.4f, 10.91f)
                curveTo(13.72f, 10.65f, 14.19f, 10.7f, 14.45f, 11.03f)
                curveTo(14.72f, 11.35f, 14.67f, 11.83f, 14.34f, 12.09f)
                close()
            }
        }.build()

        return _SmsStar!!
    }

@Suppress("ObjectPropertyName")
private var _SmsStar: ImageVector? = null
