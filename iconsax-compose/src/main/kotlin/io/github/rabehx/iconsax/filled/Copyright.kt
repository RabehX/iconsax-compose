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


val Iconsax.Filled.Copyright: ImageVector
    get() {
        if (_Copyright != null) {
            return _Copyright!!
        }
        _Copyright = ImageVector.Builder(
            name = "Filled.Copyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(12.24f, 15.25f)
                curveTo(13.02f, 15.25f, 13.79f, 14.96f, 14.38f, 14.44f)
                curveTo(14.69f, 14.17f, 15.17f, 14.2f, 15.44f, 14.51f)
                curveTo(15.71f, 14.82f, 15.68f, 15.3f, 15.37f, 15.57f)
                curveTo(14.5f, 16.34f, 13.39f, 16.76f, 12.24f, 16.76f)
                curveTo(9.62f, 16.76f, 7.49f, 14.63f, 7.49f, 12.01f)
                curveTo(7.49f, 9.39f, 9.62f, 7.26f, 12.24f, 7.26f)
                curveTo(13.39f, 7.26f, 14.51f, 7.68f, 15.37f, 8.45f)
                curveTo(15.68f, 8.72f, 15.71f, 9.2f, 15.44f, 9.51f)
                curveTo(15.16f, 9.82f, 14.69f, 9.85f, 14.38f, 9.58f)
                curveTo(13.79f, 9.06f, 13.03f, 8.77f, 12.24f, 8.77f)
                curveTo(10.45f, 8.77f, 8.99f, 10.23f, 8.99f, 12.02f)
                curveTo(8.99f, 13.81f, 10.45f, 15.25f, 12.24f, 15.25f)
                close()
            }
        }.build()

        return _Copyright!!
    }

@Suppress("ObjectPropertyName")
private var _Copyright: ImageVector? = null
