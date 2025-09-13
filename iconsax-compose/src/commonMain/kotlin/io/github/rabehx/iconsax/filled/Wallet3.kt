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


val Iconsax.Filled.Wallet3: ImageVector
    get() {
        if (_Wallet3 != null) {
            return _Wallet3!!
        }
        _Wallet3 = ImageVector.Builder(
            name = "Filled.Wallet3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.622f)
                verticalLineTo(14.682f)
                curveTo(22f, 15.242f, 21.54f, 15.702f, 20.97f, 15.702f)
                horizontalLineTo(19.04f)
                curveTo(17.96f, 15.702f, 16.97f, 14.912f, 16.88f, 13.832f)
                curveTo(16.82f, 13.202f, 17.06f, 12.612f, 17.48f, 12.202f)
                curveTo(17.85f, 11.822f, 18.36f, 11.602f, 18.92f, 11.602f)
                horizontalLineTo(20.97f)
                curveTo(21.54f, 11.602f, 22f, 12.062f, 22f, 12.622f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.38f, 13.958f)
                curveTo(15.29f, 12.908f, 15.67f, 11.878f, 16.43f, 11.128f)
                curveTo(17.07f, 10.478f, 17.96f, 10.098f, 18.92f, 10.098f)
                horizontalLineTo(19.49f)
                curveTo(19.77f, 10.098f, 20f, 9.868f, 19.96f, 9.588f)
                curveTo(19.69f, 7.648f, 18.01f, 6.148f, 16f, 6.148f)
                horizontalLineTo(6f)
                curveTo(3.79f, 6.148f, 2f, 7.938f, 2f, 10.148f)
                verticalLineTo(17.148f)
                curveTo(2f, 19.358f, 3.79f, 21.148f, 6f, 21.148f)
                horizontalLineTo(16f)
                curveTo(18.02f, 21.148f, 19.69f, 19.648f, 19.96f, 17.708f)
                curveTo(20f, 17.428f, 19.77f, 17.198f, 19.49f, 17.198f)
                horizontalLineTo(19.04f)
                curveTo(17.14f, 17.198f, 15.54f, 15.778f, 15.38f, 13.958f)
                close()
                moveTo(13f, 11.898f)
                horizontalLineTo(7f)
                curveTo(6.59f, 11.898f, 6.25f, 11.568f, 6.25f, 11.148f)
                curveTo(6.25f, 10.728f, 6.59f, 10.398f, 7f, 10.398f)
                horizontalLineTo(13f)
                curveTo(13.41f, 10.398f, 13.75f, 10.738f, 13.75f, 11.148f)
                curveTo(13.75f, 11.558f, 13.41f, 11.898f, 13f, 11.898f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.211f, 3.982f)
                curveTo(14.471f, 4.252f, 14.241f, 4.652f, 13.861f, 4.652f)
                horizontalLineTo(6.031f)
                curveTo(4.941f, 4.652f, 3.921f, 4.972f, 3.071f, 5.522f)
                curveTo(2.681f, 5.772f, 2.151f, 5.502f, 2.341f, 5.072f)
                curveTo(2.901f, 3.762f, 4.211f, 2.852f, 5.721f, 2.852f)
                horizontalLineTo(11.341f)
                curveTo(12.501f, 2.852f, 13.531f, 3.262f, 14.211f, 3.982f)
                close()
            }
        }.build()

        return _Wallet3!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet3: ImageVector? = null
