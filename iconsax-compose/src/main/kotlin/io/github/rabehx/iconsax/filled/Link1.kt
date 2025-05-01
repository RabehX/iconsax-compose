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


val Iconsax.Filled.Link1: ImageVector
    get() {
        if (_Link1 != null) {
            return _Link1!!
        }
        _Link1 = ImageVector.Builder(
            name = "Filled.Link1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.408f, 18.592f)
                curveTo(15.008f, 18.592f, 14.678f, 18.262f, 14.678f, 17.862f)
                curveTo(14.678f, 17.462f, 15.008f, 17.132f, 15.408f, 17.132f)
                curveTo(18.228f, 17.132f, 20.528f, 14.832f, 20.528f, 12.012f)
                curveTo(20.528f, 9.192f, 18.228f, 6.892f, 15.408f, 6.892f)
                curveTo(12.588f, 6.892f, 10.288f, 9.192f, 10.288f, 12.012f)
                curveTo(10.288f, 12.412f, 9.958f, 12.742f, 9.558f, 12.742f)
                curveTo(9.158f, 12.742f, 8.828f, 12.412f, 8.828f, 12.012f)
                curveTo(8.828f, 8.382f, 11.778f, 5.422f, 15.418f, 5.422f)
                curveTo(19.058f, 5.422f, 21.998f, 8.372f, 21.998f, 12.002f)
                curveTo(21.998f, 15.632f, 19.048f, 18.592f, 15.408f, 18.592f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.59f, 5.41f)
                curveTo(8.99f, 5.41f, 9.32f, 5.74f, 9.32f, 6.14f)
                curveTo(9.32f, 6.54f, 8.99f, 6.87f, 8.59f, 6.87f)
                curveTo(5.77f, 6.87f, 3.47f, 9.17f, 3.47f, 11.99f)
                curveTo(3.47f, 14.81f, 5.77f, 17.11f, 8.59f, 17.11f)
                curveTo(11.41f, 17.11f, 13.71f, 14.81f, 13.71f, 11.99f)
                curveTo(13.71f, 11.59f, 14.04f, 11.26f, 14.44f, 11.26f)
                curveTo(14.84f, 11.26f, 15.17f, 11.59f, 15.17f, 11.99f)
                curveTo(15.17f, 15.62f, 12.22f, 18.58f, 8.58f, 18.58f)
                curveTo(4.94f, 18.58f, 2f, 15.63f, 2f, 12f)
                curveTo(2f, 8.37f, 4.95f, 5.41f, 8.59f, 5.41f)
                close()
            }
        }.build()

        return _Link1!!
    }

@Suppress("ObjectPropertyName")
private var _Link1: ImageVector? = null
