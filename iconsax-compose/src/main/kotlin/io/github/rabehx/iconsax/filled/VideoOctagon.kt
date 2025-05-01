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


val Iconsax.Filled.VideoOctagon: ImageVector
    get() {
        if (_VideoOctagon != null) {
            return _VideoOctagon!!
        }
        _VideoOctagon = ImageVector.Builder(
            name = "Filled.VideoOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.512f, 5.85f)
                lineTo(13.572f, 2.42f)
                curveTo(12.602f, 1.86f, 11.402f, 1.86f, 10.422f, 2.42f)
                lineTo(4.492f, 5.85f)
                curveTo(3.522f, 6.41f, 2.922f, 7.45f, 2.922f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(2.922f, 16.54f, 3.522f, 17.58f, 4.492f, 18.15f)
                lineTo(10.432f, 21.58f)
                curveTo(11.402f, 22.14f, 12.602f, 22.14f, 13.582f, 21.58f)
                lineTo(19.522f, 18.15f)
                curveTo(20.492f, 17.59f, 21.092f, 16.55f, 21.092f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(21.082f, 7.45f, 20.482f, 6.42f, 19.512f, 5.85f)
                close()
                moveTo(14.252f, 13.4f)
                lineTo(13.212f, 14f)
                lineTo(12.172f, 14.6f)
                curveTo(10.842f, 15.37f, 9.752f, 14.74f, 9.752f, 13.2f)
                verticalLineTo(12f)
                verticalLineTo(10.8f)
                curveTo(9.752f, 9.26f, 10.842f, 8.63f, 12.172f, 9.4f)
                lineTo(13.212f, 10f)
                lineTo(14.252f, 10.6f)
                curveTo(15.582f, 11.37f, 15.582f, 12.63f, 14.252f, 13.4f)
                close()
            }
        }.build()

        return _VideoOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOctagon: ImageVector? = null
