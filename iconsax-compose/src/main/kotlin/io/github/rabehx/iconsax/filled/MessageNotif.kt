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


val Iconsax.Filled.MessageNotif: ImageVector
    get() {
        if (_MessageNotif != null) {
            return _MessageNotif!!
        }
        _MessageNotif = ImageVector.Builder(
            name = "Filled.MessageNotif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 6.75f)
                curveTo(21.519f, 6.75f, 22.75f, 5.519f, 22.75f, 4f)
                curveTo(22.75f, 2.481f, 21.519f, 1.25f, 20f, 1.25f)
                curveTo(18.481f, 1.25f, 17.25f, 2.481f, 17.25f, 4f)
                curveTo(17.25f, 5.519f, 18.481f, 6.75f, 20f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.04f, 8.15f)
                curveTo(17.47f, 7.81f, 16.19f, 6.53f, 15.85f, 4.96f)
                curveTo(15.72f, 4.35f, 15.71f, 3.76f, 15.82f, 3.2f)
                curveTo(15.95f, 2.58f, 15.49f, 2f, 14.85f, 2f)
                horizontalLineTo(7f)
                curveTo(4.24f, 2f, 2f, 4.24f, 2f, 7f)
                verticalLineTo(13.95f)
                curveTo(2f, 16.71f, 4.24f, 18.95f, 7f, 18.95f)
                horizontalLineTo(8.5f)
                curveTo(8.78f, 18.95f, 9.14f, 19.13f, 9.3f, 19.35f)
                lineTo(10.8f, 21.34f)
                curveTo(11.46f, 22.22f, 12.54f, 22.22f, 13.2f, 21.34f)
                lineTo(14.7f, 19.35f)
                curveTo(14.89f, 19.1f, 15.18f, 18.95f, 15.5f, 18.95f)
                horizontalLineTo(17.01f)
                curveTo(19.77f, 18.95f, 22f, 16.72f, 22f, 13.96f)
                verticalLineTo(9.15f)
                curveTo(22f, 8.52f, 21.42f, 8.06f, 20.8f, 8.18f)
                curveTo(20.24f, 8.28f, 19.65f, 8.28f, 19.04f, 8.15f)
                close()
                moveTo(8f, 12f)
                curveTo(7.44f, 12f, 7f, 11.55f, 7f, 11f)
                curveTo(7f, 10.45f, 7.44f, 10f, 8f, 10f)
                curveTo(8.55f, 10f, 9f, 10.45f, 9f, 11f)
                curveTo(9f, 11.55f, 8.56f, 12f, 8f, 12f)
                close()
                moveTo(12f, 12f)
                curveTo(11.44f, 12f, 11f, 11.55f, 11f, 11f)
                curveTo(11f, 10.45f, 11.44f, 10f, 12f, 10f)
                curveTo(12.55f, 10f, 13f, 10.45f, 13f, 11f)
                curveTo(13f, 11.55f, 12.56f, 12f, 12f, 12f)
                close()
                moveTo(16f, 12f)
                curveTo(15.44f, 12f, 15f, 11.55f, 15f, 11f)
                curveTo(15f, 10.45f, 15.44f, 10f, 16f, 10f)
                curveTo(16.55f, 10f, 17f, 10.45f, 17f, 11f)
                curveTo(17f, 11.55f, 16.56f, 12f, 16f, 12f)
                close()
            }
        }.build()

        return _MessageNotif!!
    }

@Suppress("ObjectPropertyName")
private var _MessageNotif: ImageVector? = null
