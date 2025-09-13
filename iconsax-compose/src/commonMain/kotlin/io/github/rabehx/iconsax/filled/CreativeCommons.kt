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


val Iconsax.Filled.CreativeCommons: ImageVector
    get() {
        if (_CreativeCommons != null) {
            return _CreativeCommons!!
        }
        _CreativeCommons = ImageVector.Builder(
            name = "Filled.CreativeCommons",
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
                moveTo(8.99f, 14.12f)
                curveTo(9.5f, 14.12f, 10f, 13.93f, 10.39f, 13.59f)
                curveTo(10.7f, 13.32f, 11.18f, 13.35f, 11.45f, 13.66f)
                curveTo(11.72f, 13.97f, 11.69f, 14.45f, 11.38f, 14.72f)
                curveTo(10.72f, 15.3f, 9.87f, 15.62f, 8.99f, 15.62f)
                curveTo(6.99f, 15.62f, 5.37f, 14f, 5.37f, 12f)
                curveTo(5.37f, 10f, 6.99f, 8.38f, 8.99f, 8.38f)
                curveTo(9.87f, 8.38f, 10.71f, 8.7f, 11.38f, 9.28f)
                curveTo(11.69f, 9.55f, 11.72f, 10.03f, 11.45f, 10.34f)
                curveTo(11.18f, 10.65f, 10.7f, 10.68f, 10.39f, 10.41f)
                curveTo(10f, 10.07f, 9.5f, 9.88f, 8.99f, 9.88f)
                curveTo(7.82f, 9.88f, 6.87f, 10.83f, 6.87f, 12f)
                curveTo(6.87f, 13.17f, 7.82f, 14.12f, 8.99f, 14.12f)
                close()
                moveTo(15.99f, 14.12f)
                curveTo(16.5f, 14.12f, 17f, 13.93f, 17.39f, 13.59f)
                curveTo(17.7f, 13.32f, 18.18f, 13.35f, 18.45f, 13.66f)
                curveTo(18.72f, 13.97f, 18.69f, 14.45f, 18.38f, 14.72f)
                curveTo(17.72f, 15.3f, 16.87f, 15.62f, 15.99f, 15.62f)
                curveTo(13.99f, 15.62f, 12.37f, 14f, 12.37f, 12f)
                curveTo(12.37f, 10f, 13.99f, 8.38f, 15.99f, 8.38f)
                curveTo(16.87f, 8.38f, 17.71f, 8.7f, 18.38f, 9.28f)
                curveTo(18.69f, 9.55f, 18.72f, 10.03f, 18.45f, 10.34f)
                curveTo(18.18f, 10.65f, 17.7f, 10.68f, 17.39f, 10.41f)
                curveTo(17f, 10.07f, 16.51f, 9.88f, 15.99f, 9.88f)
                curveTo(14.82f, 9.88f, 13.87f, 10.83f, 13.87f, 12f)
                curveTo(13.87f, 13.17f, 14.82f, 14.12f, 15.99f, 14.12f)
                close()
            }
        }.build()

        return _CreativeCommons!!
    }

@Suppress("ObjectPropertyName")
private var _CreativeCommons: ImageVector? = null
