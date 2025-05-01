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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ClipboardExport: ImageVector
    get() {
        if (_ClipboardExport != null) {
            return _ClipboardExport!!
        }
        _ClipboardExport = ImageVector.Builder(
            name = "Outline.ClipboardExport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 6.75f)
                horizontalLineTo(10f)
                curveTo(9.04f, 6.75f, 7.25f, 6.75f, 7.25f, 4f)
                curveTo(7.25f, 1.25f, 9.04f, 1.25f, 10f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.96f, 1.25f, 16.75f, 1.25f, 16.75f, 4f)
                curveTo(16.75f, 4.96f, 16.75f, 6.75f, 14f, 6.75f)
                close()
                moveTo(10f, 2.75f)
                curveTo(9.01f, 2.75f, 8.75f, 2.75f, 8.75f, 4f)
                curveTo(8.75f, 5.25f, 9.01f, 5.25f, 10f, 5.25f)
                horizontalLineTo(14f)
                curveTo(15.25f, 5.25f, 15.25f, 4.99f, 15.25f, 4f)
                curveTo(15.25f, 2.75f, 14.99f, 2.75f, 14f, 2.75f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.38f, 22.75f, 2.25f, 20.17f, 2.25f, 16f)
                verticalLineTo(10f)
                curveTo(2.25f, 5.44f, 3.9f, 3.49f, 7.96f, 3.28f)
                curveTo(8.35f, 3.26f, 8.73f, 3.57f, 8.75f, 3.99f)
                curveTo(8.77f, 4.41f, 8.45f, 4.75f, 8.04f, 4.77f)
                curveTo(5.2f, 4.93f, 3.75f, 5.78f, 3.75f, 10f)
                verticalLineTo(16f)
                curveTo(3.75f, 19.7f, 4.48f, 21.25f, 9f, 21.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 21.25f, 14.75f, 21.59f, 14.75f, 22f)
                curveTo(14.75f, 22.41f, 14.41f, 22.75f, 14f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.001f, 15.75f)
                curveTo(20.591f, 15.75f, 20.251f, 15.41f, 20.251f, 15f)
                verticalLineTo(10f)
                curveTo(20.251f, 5.78f, 18.801f, 4.93f, 15.961f, 4.77f)
                curveTo(15.551f, 4.75f, 15.231f, 4.39f, 15.251f, 3.98f)
                curveTo(15.271f, 3.57f, 15.631f, 3.25f, 16.041f, 3.27f)
                curveTo(20.101f, 3.49f, 21.751f, 5.44f, 21.751f, 9.99f)
                verticalLineTo(14.99f)
                curveTo(21.751f, 15.41f, 21.411f, 15.75f, 21.001f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 19.75f)
                curveTo(14.59f, 19.75f, 14.25f, 19.41f, 14.25f, 19f)
                verticalLineTo(16f)
                curveTo(14.25f, 15.59f, 14.59f, 15.25f, 15f, 15.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 15.25f, 18.75f, 15.59f, 18.75f, 16f)
                curveTo(18.75f, 16.41f, 18.41f, 16.75f, 18f, 16.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(19f)
                curveTo(15.75f, 19.41f, 15.41f, 19.75f, 15f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22.75f)
                curveTo(20.81f, 22.75f, 20.621f, 22.68f, 20.471f, 22.53f)
                lineTo(14.51f, 16.57f)
                curveTo(14.22f, 16.28f, 14.22f, 15.8f, 14.51f, 15.51f)
                curveTo(14.8f, 15.22f, 15.281f, 15.22f, 15.571f, 15.51f)
                lineTo(21.531f, 21.47f)
                curveTo(21.82f, 21.76f, 21.82f, 22.24f, 21.531f, 22.53f)
                curveTo(21.381f, 22.68f, 21.191f, 22.75f, 21f, 22.75f)
                close()
            }
        }.build()

        return _ClipboardExport!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardExport: ImageVector? = null
