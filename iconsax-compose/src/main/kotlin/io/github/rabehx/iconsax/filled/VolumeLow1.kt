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


val Iconsax.Filled.VolumeLow1: ImageVector
    get() {
        if (_VolumeLow1 != null) {
            return _VolumeLow1!!
        }
        _VolumeLow1 = ImageVector.Builder(
            name = "Filled.VolumeLow1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.328f, 16.75f)
                curveTo(19.168f, 16.75f, 19.018f, 16.7f, 18.878f, 16.6f)
                curveTo(18.548f, 16.35f, 18.478f, 15.88f, 18.728f, 15.55f)
                curveTo(20.298f, 13.46f, 20.298f, 10.54f, 18.728f, 8.45f)
                curveTo(18.478f, 8.12f, 18.548f, 7.65f, 18.878f, 7.4f)
                curveTo(19.208f, 7.15f, 19.678f, 7.22f, 19.928f, 7.55f)
                curveTo(21.898f, 10.17f, 21.898f, 13.83f, 19.928f, 16.45f)
                curveTo(19.788f, 16.65f, 19.558f, 16.75f, 19.328f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.348f, 3.782f)
                curveTo(14.228f, 3.162f, 12.798f, 3.322f, 11.338f, 4.232f)
                lineTo(8.418f, 6.062f)
                curveTo(8.218f, 6.182f, 7.988f, 6.252f, 7.758f, 6.252f)
                horizontalLineTo(6.828f)
                horizontalLineTo(6.328f)
                curveTo(3.908f, 6.252f, 2.578f, 7.582f, 2.578f, 10.002f)
                verticalLineTo(14.002f)
                curveTo(2.578f, 16.422f, 3.908f, 17.752f, 6.328f, 17.752f)
                horizontalLineTo(6.828f)
                horizontalLineTo(7.758f)
                curveTo(7.988f, 17.752f, 8.218f, 17.822f, 8.418f, 17.942f)
                lineTo(11.338f, 19.772f)
                curveTo(12.218f, 20.322f, 13.078f, 20.592f, 13.878f, 20.592f)
                curveTo(14.398f, 20.592f, 14.898f, 20.472f, 15.348f, 20.222f)
                curveTo(16.458f, 19.602f, 17.078f, 18.312f, 17.078f, 16.592f)
                verticalLineTo(7.412f)
                curveTo(17.078f, 5.692f, 16.458f, 4.402f, 15.348f, 3.782f)
                close()
            }
        }.build()

        return _VolumeLow1!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeLow1: ImageVector? = null
