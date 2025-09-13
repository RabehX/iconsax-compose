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


val Iconsax.Filled.Unlimited: ImageVector
    get() {
        if (_Unlimited != null) {
            return _Unlimited!!
        }
        _Unlimited = ImageVector.Builder(
            name = "Filled.Unlimited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.45f, 17.302f)
                curveTo(15.77f, 17.302f, 14.22f, 16.512f, 13.21f, 15.122f)
                curveTo(12.97f, 14.792f, 13.04f, 14.322f, 13.37f, 14.072f)
                curveTo(13.7f, 13.822f, 14.17f, 13.902f, 14.42f, 14.232f)
                curveTo(15.15f, 15.222f, 16.25f, 15.792f, 17.45f, 15.792f)
                curveTo(19.54f, 15.792f, 21.25f, 14.092f, 21.25f, 11.992f)
                curveTo(21.25f, 9.892f, 19.55f, 8.192f, 17.45f, 8.192f)
                curveTo(16.03f, 8.192f, 14.69f, 8.952f, 13.96f, 10.162f)
                lineTo(11.31f, 14.572f)
                curveTo(10.31f, 16.242f, 8.48f, 17.272f, 6.54f, 17.272f)
                curveTo(3.62f, 17.272f, 1.24f, 14.892f, 1.24f, 11.972f)
                curveTo(1.24f, 9.052f, 3.62f, 6.672f, 6.54f, 6.672f)
                curveTo(8.22f, 6.672f, 9.77f, 7.462f, 10.78f, 8.852f)
                curveTo(11.02f, 9.182f, 10.95f, 9.652f, 10.62f, 9.902f)
                curveTo(10.28f, 10.152f, 9.82f, 10.072f, 9.57f, 9.742f)
                curveTo(8.85f, 8.772f, 7.75f, 8.202f, 6.55f, 8.202f)
                curveTo(4.46f, 8.202f, 2.75f, 9.902f, 2.75f, 12.002f)
                curveTo(2.75f, 14.102f, 4.45f, 15.802f, 6.55f, 15.802f)
                curveTo(7.97f, 15.802f, 9.31f, 15.042f, 10.04f, 13.832f)
                lineTo(12.69f, 9.422f)
                curveTo(13.69f, 7.752f, 15.52f, 6.722f, 17.46f, 6.722f)
                curveTo(20.38f, 6.722f, 22.76f, 9.102f, 22.76f, 12.022f)
                curveTo(22.76f, 14.942f, 20.37f, 17.302f, 17.45f, 17.302f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 14f)
                curveTo(7.605f, 14f, 8.5f, 13.105f, 8.5f, 12f)
                curveTo(8.5f, 10.895f, 7.605f, 10f, 6.5f, 10f)
                curveTo(5.395f, 10f, 4.5f, 10.895f, 4.5f, 12f)
                curveTo(4.5f, 13.105f, 5.395f, 14f, 6.5f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 14f)
                curveTo(18.605f, 14f, 19.5f, 13.105f, 19.5f, 12f)
                curveTo(19.5f, 10.895f, 18.605f, 10f, 17.5f, 10f)
                curveTo(16.395f, 10f, 15.5f, 10.895f, 15.5f, 12f)
                curveTo(15.5f, 13.105f, 16.395f, 14f, 17.5f, 14f)
                close()
            }
        }.build()

        return _Unlimited!!
    }

@Suppress("ObjectPropertyName")
private var _Unlimited: ImageVector? = null
